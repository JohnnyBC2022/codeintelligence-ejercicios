public abstract class Empleado {
    private String nombre;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Constructor
    public Empleado(String nombre){
        this.nombre = nombre;
    }

    // Método abstracto para implentar en las subclases
    public abstract double calcularSalario();


}
