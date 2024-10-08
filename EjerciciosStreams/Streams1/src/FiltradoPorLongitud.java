import java.util.ArrayList;
import java.util.List;

public class FiltradoPorLongitud {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("cadena");
        palabras.add("de");
        palabras.add("palabras.");

        // Filtrar las palabras que tienen más de 5 caracteres
        List<String> palabrasFiltradas = palabras.stream()
                .filter(palabra -> palabra.length() > 5)
                .toList(); // Convierte el Stream filtrado a una lista


        System.out.println("Palabras con más de 5 caracteres:");
        palabrasFiltradas.forEach(System.out::println);
    }
}
