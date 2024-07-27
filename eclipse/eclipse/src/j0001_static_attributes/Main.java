package j0001_static_attributes;
public class Main {
    public static void main(String[] args) {
        // Crear varias instancias de Contador
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        // Acceder al atributo estático directamente a través del nombre de la clase
        System.out.println("Número de instancias creadas: " + Contador.obtenerContadorDeInstancias());
    }
}