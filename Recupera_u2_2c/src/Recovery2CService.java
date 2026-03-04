public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7
        return false;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        return false;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        return false;
    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        return "";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        return false;
    }
}
