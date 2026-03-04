public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        if (codigo == null || codigo.isEmpty() || codigo.trim().length() != 7 ){
            return false;
        }
        return true;
    }

    public static boolean esCategoriaValida(int categoria) {
        if (categoria == 1 || categoria == 2 || categoria == 3 || categoria == 4){
        return true;
    }
        return false;
    }

    public static boolean esHoraValida(int horas) {
        if (horas >= 1 || horas <= 12){
            return true;
        }
        return false;
    }

    public static String clasificarPrioridad(int horas) {
        if (horas <= 3){
            return "BAJA";
        }
        if (horas >= 4 || horas <= 7){
            return "MEDIA";
        }
        if (horas > 7){
            return "ALTA";
        }
        return "";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        if (categoria == 1 && horas > 8){
            return true;
        }
        return false;
    }
}
