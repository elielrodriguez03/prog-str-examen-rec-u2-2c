public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7
        if (codigo.length()>7 && codigo == null) {
            return false;
        }
        return true;
    }

    public boolean esCategoriaValida(int categoria) {
        if (categoria < 1 && categoria > 4) {
            return true;
        }
        return false;
    }


    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if (horas > 12 && horas < 1) {
            return false;
        }
        return true;
    }


    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        if (horas <3){
        }
        if (horas <4 && horas >7){
        }
        return "";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if (categoria == 1 && horas > 8) {
            return true;
        }
        return false;
    }
}