import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String prioridad;
        int totalValidas = 0;
        int totalLaptop = 0, totalProyector = 0, totalArduino = 0, totalCableado = 0;
        int totalBaja = 0, totalMedia = 0, totalAlta = 0;
        int sumaHoras = 0;

        while (true) {
            System.out.print("Código (7 chars) o FIN: ");
            String codigo = sc.next();

            if (codigo.equalsIgnoreCase("FIN")) break;

            if (!Recovery2CService.esCodigoValido(codigo)) {
                System.out.println("Código inválido");
                continue;
            }

            System.out.print("Categoría (1=Laptop, 2=Proyector, 3=Kit Arduino, 4=Cableado): ");
            if (!sc.hasNextInt()) {
                System.out.println("Categoría inválida");
                return;
            }
            int categoria = sc.nextInt();

            if (!Recovery2CService.esCategoriaValida(categoria)) {
                System.out.println("Categoría inválida");
                continue;
            }

            System.out.print("Horas (1..12): ");
            if (!sc.hasNextInt()) {
                System.out.println("Horas inválidas");
                return;
            }
            int horas = sc.nextInt();

            if (!Recovery2CService.esHoraValida(horas)) {
                System.out.println("Horas inválidas");
                continue;
            }

            totalValidas++;
            sumaHoras += horas;

            if (categoria == 1) totalLaptop++;
            else if (categoria == 2) totalProyector++;
            else if (categoria == 3) totalArduino++;
            else totalCableado++;

            String pr = Recovery2CService.clasificarPrioridad(horas);
            if (pr.equals("BAJA")) totalBaja++;
            else if (pr.equals("MEDIA")) totalMedia++;
            else totalAlta++;

            if (Recovery2CService.requiereAutorizacion(categoria, horas)) {
                System.out.println("REQUIERE AUTORIZACIÓN");
                break;
            }
        }

        System.out.println("\n===RESUMEN FINAL===");
        System.out.println("Solicitudes válidas: " + totalValidas);
        System.out.println("Laptop: " + totalLaptop);
        System.out.println("Proyector: " + totalProyector);
        System.out.println("Kit Arduino: " + totalArduino);
        System.out.println("Cableado: " + totalCableado);
        System.out.println("Prioridad BAJA: " + totalBaja);
        System.out.println("Prioridad MEDIA: " + totalMedia);
        System.out.println("Prioridad ALTA: " + totalAlta);

        double promedio = (totalValidas == 0) ? 0.0 : (sumaHoras * 1.0 / totalValidas);
        System.out.printf("Promedio horas: %.2f\n", promedio);
    }
}
