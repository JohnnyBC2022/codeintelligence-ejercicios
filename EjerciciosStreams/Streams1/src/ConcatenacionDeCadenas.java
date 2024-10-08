import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenacionDeCadenas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Aeji");
        nombres.add("Alejandro");
        nombres.add("Hugo");
        nombres.add("Jaime");
        nombres.add("Jesus");
        nombres.add("Jeffry");
        nombres.add("Jon");
        nombres.add("Jonathan");
        nombres.add("Jose Miguel");
        nombres.add("Miguel Ángel Guaita");
        nombres.add("Miguel Ángel Rivera");

        // Concatenar los nombres en una sola cadena, separados por comas
        String nombresConcatenados = nombres.stream()
                .collect(Collectors.joining(", ")); // Concatenar usando Collectors.joining()

        // Mostrar el resultado
        System.out.println("Nombres concatenados:");
        System.out.println(nombresConcatenados);
    }
}
