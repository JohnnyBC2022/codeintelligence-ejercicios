// Esta clase hereda el método calcularArea de la clase Figura

import java.text.DecimalFormat;

public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea() para el círculo
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
}
