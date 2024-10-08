import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class CalculoPromedio {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }

        // Para poder trabajar con números enteros, se necesita InstSream

        OptionalDouble promedio = numeros.stream().mapToInt(Integer::intValue).average();

        System.out.printf("El promedio es: %.2f%n", promedio.getAsDouble());

    }
}
