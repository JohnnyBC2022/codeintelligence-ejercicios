// Clase que hereda el método hacer sonido de la clase Animal

public class Gato extends Animal{
    // La anotación override sirve para garantizar que el método se sobreescriba

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: ¡Miau!");
    }
}
