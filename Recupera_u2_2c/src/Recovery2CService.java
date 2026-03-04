public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7
        if (codigo.length()!=7  ||codigo.equals(null)) {
            return false;

        }else {
            return true;
        }

    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if (categoria >=5 )
        return false;
        else {
            return  true;
        }
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if (horas <= 0 || horas >= 13) {
            return false;

        } else if (horas >= 1 || horas <= 12) {

        }
        return true;

    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        if (horas<=3){
            return "BAJA";
        } else if (horas >= 4 && horas <= 7) {
            return  "MEDIA";
        } else if (horas>7 ) {
            return "ALTA";

        }
        return "ALTA";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if (categoria == 1 && horas>8 ) {
            return  true;
        }else {
            return  false;
        }

    }
}
