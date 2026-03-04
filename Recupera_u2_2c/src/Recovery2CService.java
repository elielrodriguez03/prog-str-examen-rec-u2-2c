public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        if(codigo.length() == 7){
            return true;
        }
        // - longitud exacta 7
        // - null o en blanco -> false
        if(codigo == null || codigo.isBlank());
        return false;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if(categoria >=1 && categoria<=4){
            return true;
        }
        return false;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if(horas >=1 && horas <= 12){
            return true;
        }
        return false;
    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        if (horas <= 3){
            return "Prioridad baja";
            // MEDIA 4..7
        } else if (horas >= 4 && horas <=7) {
            return "Prioridad media";
        }else {
            // ALTA > 7
            return "Prioridad alta";
        }
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if(categoria == 1 && horas > 8){
            return true;
        }
        return false;
    }
}
