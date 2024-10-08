import java.util.ArrayList;
import java.util.List;

public class RepositorioDePersonas {
    private List<Persona> personas;

    public RepositorioDePersonas() {
        this.personas = new ArrayList<>();
    }


    public void agregarPersona(Persona persona) {
        personas.add(persona);
        System.out.println("Persona añadida: " + persona);
    }

    public void eliminarPersona(int id) {
        boolean eliminado = personas.removeIf(persona -> persona.getId() == id);
        if (eliminado) {
            System.out.println("Persona con ID " + id + " eliminada.");
        } else {
            System.out.println("No se encontró la persona con ID " + id + ".");
        }
    }

    public void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas en el repositorio.");
        } else {
            System.out.println("Lista de personas:");
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }
}
