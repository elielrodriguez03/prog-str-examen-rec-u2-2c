public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        if (codigo == null && codigo.length()!=7 ) {
            char ch=0;
            if(ch>0 && ch<8){

                return false;
            }
            return false;
        }
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7

        return false;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if(categoria<0 && categoria>4) {
            return false;
        }
       return false;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if(horas<0 && horas>12){

        }


        return false;
    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        if(horas==3){
            //totalBaja;
        }
       //  BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        return "";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if(categoria==1 && horas>8){

        }
        return false;
    }
}
