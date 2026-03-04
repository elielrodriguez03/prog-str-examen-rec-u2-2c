import java.util.Objects;
public class Recovery2CService {

    // Valida que el código no sea nulo/vacío y tenga exactamente 7 caracteres
    public static boolean esCodigoValido(String codigo) {
        return Objects.nonNull(codigo) && !codigo.isBlank() && codigo.length() == 7;
    }

    // Valida que la categoría sea 1, 2, 3 o 4
    public static boolean esCategoriaValida(int categoria) {
        return categoria >= 1 && categoria <= 4;
    }

    // Valida que las horas estén entre 1 y 12 inclusive
    public static boolean esHoraValida(int horas) {
        return horas >= 1 && horas <= 12;
    }

    // Clasifica la prioridad según las horas
    public static String clasificarPrioridad(int horas) {
        if (horas <= 3) {
            return "BAJA";
        } else if (horas >= 4 && horas <= 7) {
            return "MEDIA";
        } else {
            return "ALTA";
        }
    }

    // Verifica si requiere autorización (Laptop y horas > 8)
    public static boolean requiereAutorizacion(int categoria, int horas) {
        return categoria == 1 && horas > 8;
    }
}
