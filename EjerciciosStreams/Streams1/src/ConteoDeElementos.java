import java.util.ArrayList;
import java.util.List;

public class ConteoDeElementos {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(12);
        numeros.add(9);
        numeros.add(15);
        numeros.add(20);
        numeros.add(7);
        numeros.add(11);
        numeros.add(3);


        long conteo = numeros.stream()
                .filter(num -> num > 10)
                .count();

        System.out.println("Cantidad de números mayores que 10: " + conteo);
    }
}
