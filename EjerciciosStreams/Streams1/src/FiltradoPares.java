import java.util.ArrayList;
import java.util.List;


public class FiltradoPares {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }

        // Filtrar los números pares usando Streams
        System.out.print("Números pares: ");
        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> System.out.print(numero + ", "));


    }
}
