public class Main {
    public static void main(String[] args) {
        RepositorioDePersonas repositorio = new RepositorioDePersonas();


        Persona persona1 = new Persona(1, "Jonathan");
        Persona persona2 = new Persona(2, "Jose");
        Persona persona3 = new Persona(3, "Jesus");

        // Agregar personas al repositorio
        repositorio.agregarPersona(persona1);
        repositorio.agregarPersona(persona2);
        repositorio.agregarPersona(persona3);

        // Listar personas
        repositorio.listarPersonas();

        // Eliminar una persona
        repositorio.eliminarPersona(2);

        // Listar personas después de eliminar
        repositorio.listarPersonas();

        // Intentar eliminar una persona que no existe
        repositorio.eliminarPersona(4);
    }
}
