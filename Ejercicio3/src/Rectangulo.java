// Esta clase hereda el método calcularArea de la clase Figura

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea() para el círculo
    @Override
    public double calcularArea(){
        return largo * ancho;
    }
}
