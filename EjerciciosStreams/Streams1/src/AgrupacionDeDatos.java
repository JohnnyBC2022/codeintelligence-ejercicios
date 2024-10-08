import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupacionDeDatos {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17));
        personas.add(new Persona("María", 22));
        personas.add(new Persona("Pedro", 15));
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Luis", 19));


        Map<Boolean, List<Persona>> agrupadas = personas.stream()
                .collect(Collectors.partitioningBy(persona -> persona.getEdad() >= 18));


        List<Persona> mayoresDe18 = agrupadas.get(true);
        List<Persona> menoresDe18 = agrupadas.get(false);


        System.out.println("Personas mayores de 18 años:");
        for (Persona p : mayoresDe18) {
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años");
        }

        System.out.println("\nPersonas menores de 18 años:");
        for (Persona p : menoresDe18) {
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años");
        }
    }
}
