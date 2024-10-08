public class Main {
    public static void main(String[] args) {
        // Creamos un objeto perro
        Animal perro = new Perro();
        // Llamamos a su método
        perro.hacerSonido();

        // Creamos un objeto gato
        Animal gato = new Gato();
        //Llamamos a su método
        gato.hacerSonido();

        Animal vaca = new Vaca();
        vaca.hacerSonido();

    }
}