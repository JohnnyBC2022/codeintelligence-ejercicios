public class Main {
    public static void main(String[] args) {

        //Creamos un círculo de radio 10
        Figura circulo = new Circulo(10);
        System.out.println("Área del círculo: "+ circulo.calcularArea());
        System.out.println("Área del círculo: "+ circulo.calcularAreaConFormato());

        //Creamos un rectángulo de largo 8 y ancho 5
        Figura rectangulo = new Rectangulo(8,5);
        System.out.println("Área del rectángulo: "+ rectangulo.calcularArea());
        System.out.println("Área del rectángulo: "+ rectangulo.calcularAreaConFormato());
    }
}