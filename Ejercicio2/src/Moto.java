public class Moto extends Vehiculo{
    // Esto genera un error: "Cannot inherit from final "Vehiculo"

    /*
    Este tipo de error se produce porque el método principal
    lo hemos declarado como final. En JAVA, una clase final es una clase
    que no puede ser heredada.
    El motivo principal para usar final en una clase es evitar que se modifique
    su comportamiento a través de la herencia.
    */
}
