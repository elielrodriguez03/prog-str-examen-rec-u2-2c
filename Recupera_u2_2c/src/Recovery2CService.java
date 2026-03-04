public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {

        if(codigo == null){
            return false;
        }
        return codigo.length() == 7;
    }

    public static boolean esCategoriaValida(int categoria) {
        return categoria >= 1 && categoria <= 4;
    }

    public static boolean esHoraValida(int horas) {
        return horas >= 1 && horas <= 12;
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
        return (categoria == 1 && horas < 8);

        }
    }

