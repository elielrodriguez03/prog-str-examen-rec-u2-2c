public class Recovery2CService {

    public static boolean esCodigoValido(String codigo) {

        if (codigo == null) {
            return false;
        } else {
            boolean codigo = false;
        }
    }

            public static boolean esCategoriaValida ( int categoria){
                categoria = 0;
                if (categoria <=1 && categoria>4)
                // TODO: 1, 2, 3 o 4
                return false;

                return false;
            }

            public static boolean esHoraValida ( int horas ){
                if (horas <= 1 && horas >= 12);
                // TODO: 1..12
                return false;
            }

            public static String clasificarPrioridad ( int horas ) {
                if (horas <= 3){
                    return "BAJA";
                } else if (horas <= 6) {
                    return  "Media";
                }
                    return  "ALta";
                // TODO:
                // BAJA <= 3
                // MEDIA 4..7
                // ALTA > 7
            }

            public static boolean requiereAutorizacion ( int categoria, int horas){
                // TODO: Laptop (1) y horas > 8
                if (categoria == 1 && horas > 8) ;

                return false;
            }


        }
