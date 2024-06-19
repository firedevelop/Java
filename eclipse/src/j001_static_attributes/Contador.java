package j001_static_attributes;

public class Contador {
    // Atributo estático
    public static int contadorDeInstancias = 0;

    // Constructor
    public Contador() {
        // Incrementa el contador cada vez que se crea una nueva instancia
        contadorDeInstancias++;
    }

    // Método estático para obtener el valor del contador
    public static int obtenerContadorDeInstancias() {
        return contadorDeInstancias;
    }
}
