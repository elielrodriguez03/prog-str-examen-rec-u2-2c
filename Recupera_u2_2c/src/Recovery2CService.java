public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // - null o en blanco -> false
        // - longitud exacta 7
        if (codigo == null) {
            return false;
        }

        if (codigo.trim().isEmpty()) {
            return false;
        }

        if (codigo.length() != 7) {
            return false;
        }

        return true;
    }

    public static boolean esCategoriaValida(int categoria) {
        // 1, 2, 3 o 4
        return categoria >= 1 && categoria <= 4;
    }

    public static boolean esHoraValida(int horas) {
        // 1..12
        return horas >= 1 && horas <= 12;
    }

    public static String clasificarPrioridad(int horas) {
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        if (horas <= 3) {
            return "BAJA";
        } else if (horas >= 4 && horas <= 7) {
            return "MEDIA";
        } else {
            return "ALTA";
        }
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // Laptop (1) y horas > 8
        return categoria == 1 && horas > 8;
    }
}