import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creo un array para almacenar la lista de empleados
        List<Empleado> empleados = new ArrayList<>();

        // Creo una instancia de un empleado de cada tipo y lo añado a la lista de empleados
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("Jonathan", 1500);
        empleados.add(empleado1);

        EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial("Jose", 20, 50);
        empleados.add(empleado2);

        // Bucle para recorrer la lista de empleados y mostrarlos por pantalla
        for (Empleado empleado: empleados) {
            System.out.println("El salario de " + empleado.getNombre() + " es: " + empleado.calcularSalario() + "€");
        }

    }
}