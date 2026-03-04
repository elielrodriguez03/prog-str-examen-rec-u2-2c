import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Acumuladores para el resumen final
        int totalSolicitudesValidas = 0;
        int totalLaptop = 0, totalProyector = 0, totalArduino = 0, totalCableado = 0;
        int totalBaja = 0, totalMedia = 0, totalAlta = 0;
        int sumaHoras = 0;

        while (true) {
            // 1. Solicitar y validar código de solicitud
            System.out.print("Ingrese código (escriba FIN para terminar): ");
            String codigo = scanner.nextLine().trim();

            // Verificar si se debe terminar el programa
            if (codigo.equalsIgnoreCase("FIN")) {
                break;
            }

            // Validar código
            if (!Recovery2CService.esCodigoValido(codigo)) {
                System.out.println("Código inválido");
                continue;
            }

            // 2. Solicitar y validar categoría
            System.out.print("Ingrese categoría (1=Laptop, 2=Proyector, 3=Kit Arduino, 4=Cableado): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Categoría inválida");
                scanner.close();
                return;
            }
            int categoria = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea pendiente

            if (!Recovery2CService.esCategoriaValida(categoria)) {
                System.out.println("Categoría inválida");
                continue;
            }

            // 3. Solicitar y validar horas
            System.out.print("Ingrese horas solicitadas (1-12): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Horas inválidas");
                scanner.close();
                return;
            }
            int horas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea pendiente

            if (!Recovery2CService.esHoraValida(horas)) {
                System.out.println("Horas inválidas");
                continue;
            }

            // Verificar si requiere autorización (regla de negocio)
            if (Recovery2CService.requiereAutorizacion(categoria, horas)) {
                System.out.println("REQUIERE AUTORIZACIÓN");
                break;
            }

            // Si todo es válido, actualizar acumuladores
            totalSolicitudesValidas++;
            sumaHoras += horas;

            // Contar por categoría
            switch (categoria) {
                case 1: totalLaptop++; break;
                case 2: totalProyector++; break;
                case 3: totalArduino++; break;
                case 4: totalCableado++; break;
            }

            // Contar por prioridad
            String prioridad = Recovery2CService.clasificarPrioridad(horas);
            switch (prioridad) {
                case "BAJA": totalBaja++; break;
                case "MEDIA": totalMedia++; break;
                case "ALTA": totalAlta++; break;
            }
        }

        // Generar resumen final
        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println("Total de solicitudes válidas: " + totalSolicitudesValidas);
        System.out.println("Total por categoría:");
        System.out.println(" Laptop: " + totalLaptop);
        System.out.println(" Proyector: " + totalProyector);
        System.out.println(" Kit Arduino: " + totalArduino);
        System.out.println(" Cableado: " + totalCableado);
        System.out.println("Total por prioridad:");
        System.out.println(" BAJA: " + totalBaja);
        System.out.println(" MEDIA: " + totalMedia);
        System.out.println(" ALTA: " + totalAlta);

        // Calcular promedio de horas (evitar división por cero)
        double promedioHoras = 0.0;
        if (totalSolicitudesValidas > 0) {
            promedioHoras = (double) sumaHoras / totalSolicitudesValidas;
        }
        System.out.printf("Promedio de horas: %.2f%n", promedioHoras);

        scanner.close();
    }
}
