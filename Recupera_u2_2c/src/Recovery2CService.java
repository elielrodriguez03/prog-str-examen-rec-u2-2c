public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        // - longitud exacta 7
         if (codigo.length()>=8) {

        }else if (codigo.length()<=6){

        }

        return true;
    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
        if (categoria <=-1 && categoria >4) {
            return true;
        }


        return true;
    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
        if (horas<1 || horas>12){

        }
        return true;
    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7
        String prioridad;
        if (horas <=3){
            prioridad = "baja";
        } else if (horas>=4 && horas<=7) {
            prioridad = "media";

        }else{
            prioridad = "alta";
        }
        return "su prioridad es" + prioridad;
    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        if (categoria==1 && horas >= 9){

        }
        return true;
    }
}
