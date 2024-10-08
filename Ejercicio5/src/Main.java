import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe un día de la semana o 'SALIR' para terminar:");
            String input = scanner.nextLine().toUpperCase();

            // Añado una función para salir del bucle
            if (input.equals("SALIR")) {
                System.out.println("Programa terminado.");
                break;
            }

            try {
                DiaSemana dia = DiaSemana.valueOf(input);

                switch (dia) {
                    case LUNES:
                    case MARTES:
                    case MIERCOLES:
                    case JUEVES:
                    case VIERNES:
                        System.out.println(dia + " es un día laborable.");
                        break;
                    case SABADO:
                    case DOMINGO:
                        System.out.println(dia + " es fin de semana.");
                        break;
                }
            } catch (IllegalArgumentException e) { // por si el usuario escribe un día no válido
                System.out.println("Día no válido, por favor, escribe un día de la semana. (Por ejemplo, LUNES...)");
            }
        }

        scanner.close();
    }
}
