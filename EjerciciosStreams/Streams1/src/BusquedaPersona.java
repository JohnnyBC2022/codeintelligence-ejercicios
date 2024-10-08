import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class BusquedaPersona {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jonathan", 25));
        personas.add(new Persona("Jose", 35));
        personas.add(new Persona("Pedro", 28));
        personas.add(new Persona("Ana", 32));

        Optional<Persona> personaMayor = personas.stream()
                .filter(persona -> persona.getEdad() > 30)
                .findFirst();

        if (personaMayor.isPresent()) {
            System.out.println("La primera persona mayor de 30 años es: " + personaMayor.get().getNombre());
        } else {
            System.out.println("No se encontró ninguna persona mayor de 30 años.");
        }
    }
}
