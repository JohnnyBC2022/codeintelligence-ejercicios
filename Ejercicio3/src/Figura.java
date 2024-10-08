// Clase abstracta figura

import java.text.DecimalFormat;

public abstract class Figura {
    public abstract double calcularArea();

    //Creo un método para que me devuelva el área con 2 decimales
    public String calcularAreaConFormato(){
        double area = calcularArea();
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(area);
    }
}

