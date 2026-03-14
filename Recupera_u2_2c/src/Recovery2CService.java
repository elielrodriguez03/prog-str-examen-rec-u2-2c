public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        if (codigo==null || codigo.isBlank() || codigo.length()!=7){
            return false;
        }
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7

        return true;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if (categoria<1 || categoria>4){
            return false;
        }
        return true;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if (horas<1 || horas>12){
            return false;
        }
        return true;
    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        if (horas<=3) {
            return "BAJA";
        }
            else if (horas<=7){
                return "MEDIA";
        }
            else {
                return "ALTA";
        }
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if(categoria==1 && horas>8){
            return true;
        }
        return false;
    }
}
