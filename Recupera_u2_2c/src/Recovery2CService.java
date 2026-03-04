public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7
        if (codigo.equals("")) {
            System.out.println("Vacio");
        } else if(codigo.length()==7){
            return true;
        }

        return false;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if(categoria==1 || categoria==2 || categoria==3 || categoria==4){
            return true;
        }
        return false;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if(horas>=1 && horas<=12){
            return true;
        }
        return false;
    }

    public static String clasificarPrioridad(int horas) {
        if(horas<=3){
            System.out.println("BAJA");
        } else if (horas>=4 && horas<=7){
            System.out.println("MEDIA");
        }else{
            System.out.println("ALTA");
        }
        return "";
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if(categoria==1 && horas>8){
            return true;
        }
        return false;
    }
}
