public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {
        // TODO:
        // - null o en blanco -> false
        return codigo !=null && codigo.length()==7 && !codigo.isBlank();

    }

    public static boolean esCategoriaValida(int categoria) {
        // TODO: 1, 2, 3 o 4
       return categoria>=1 && categoria<=4;

    }

    public static boolean esHoraValida(int horas) {
        // TODO: 1..12
       return horas>=1 && horas<=12;

    }

    public static String clasificarPrioridad(int horas) {
        // TODO:
        // BAJA <= 3
        // MEDIA 4..7
        // ALTA > 7

        if (horas<=3) {
            return "BAJA";
        }
        else if (horas>=4 || horas<=7){
            return "MEDIA";
        }
        else {
            return "ALTA";
        }

    }

    public static boolean requiereAutorizacion(int categoria, int horas) {
        // TODO: Laptop (1) y horas > 8
        return categoria==1 && horas>8;
    }
}
