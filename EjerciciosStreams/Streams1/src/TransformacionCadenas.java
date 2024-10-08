import java.util.ArrayList;
import java.util.List;

public class TransformacionCadenas {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Esto");
        palabras.add("es");
        palabras.add("una");
        palabras.add("cadena");
        palabras.add("de");
        palabras.add("palabras.");

        palabras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
