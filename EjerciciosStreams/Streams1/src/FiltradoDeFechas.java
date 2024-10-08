import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltradoDeFechas {
    public static void main(String[] args) {

        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2019, 5, 15),
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2021, 6, 30),
                LocalDate.of(2018, 12, 25),
                LocalDate.of(2024, 2, 14)
        );

        LocalDate fechaLimite = LocalDate.of(2020, 1, 1);


        List<LocalDate> fechasFiltradas = fechas.stream()
                .filter(fecha -> fecha.isAfter(fechaLimite))
                .collect(Collectors.toList());


        System.out.println("Fechas posteriores al 1 de enero de 2020: " + fechasFiltradas);
    }
}
