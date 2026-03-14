public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // null o en blanco -> false
        // longitud exacta 7
        if (codigo == null || codigo.trim().isEmpty()) {
            return false;
        }
        if (codigo.length() != 7) {
            return false;
        }

        return true;
    }

    public static boolean esCategoriaValida(int categoria) {
        // 1, 2, 3 o 4
        if (categoria >= 1 && categoria <= 4) {
            return true;
        }

        return false;
    }

    public static boolean esHoraValida(int horas) {
        // 1..12
        if (horas >= 1 && horas <= 12) {
            return true;
        }

        return false;
    }
    public static String clasificarPrioridad(int horas) {
        if (horas <= 3) {
            return "BAJA";
        } else if (horas <= 7) {
            return "MEDIA";
        } else {
            return "ALTA";
        }
    }
    public static boolean requiereAutorizacion(int categoria, int horas) {
        if (categoria == 1 && horas > 8) {
            return true;
        }
        return false;
    }
}