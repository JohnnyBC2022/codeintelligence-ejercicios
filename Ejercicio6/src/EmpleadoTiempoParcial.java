public class EmpleadoTiempoParcial extends Empleado{
    private double costePorHora;
    private int horastrabajadas;

    public EmpleadoTiempoParcial(String nombre, double costePorHora, int horastrabajadas) {
        super(nombre);
        this.costePorHora = costePorHora;
        this.horastrabajadas = horastrabajadas;
    }

    @Override
    public double calcularSalario() {
        return costePorHora * horastrabajadas; // Calcula el salario según las horas trabajadas
    }
}
