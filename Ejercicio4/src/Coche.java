// Clase coche que hereda los métodos acelerar y frenar de la clase principal

public class Coche implements Vehiculo{
    private String marcaCoche;
    private TipoVehiculo tipo;

    // El constructor recibe como parámetros la márca y el tipo de vehículo del Enum
    public Coche(String marcaCoche, TipoVehiculo tipo) {
        this.marcaCoche = marcaCoche;
        this.tipo = tipo;
    }

    // Sobreescribimos los métodos acelerar y frenar para la clase Coche
    @Override
    public void acelerar(){
        System.out.println("El " + tipo + " " + marcaCoche + " está acelerando.");
    }

    @Override
    public void frenar(){
        System.out.println("El " + tipo + " " + marcaCoche + " está frenando.");
    }

}
