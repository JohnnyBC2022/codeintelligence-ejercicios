import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConversionListaASet {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 1, 7);

        Set<Integer> numerosSinDuplicados = numeros.stream()
                .collect(Collectors.toSet());

        System.out.println("Números sin duplicados: " + numerosSinDuplicados);
    }
}
