package j0050_T08_VT06_Ejercicio07_Animal;

// Clase principal con método main
public class Main {
    public static void main(String[] args) {
        // Instanciar un perro
        Perro perro = new Perro("Marrón", "Bobby", 3, "Labrador");
        System.out.println("=== Perro ===");
        perro.comer();
        perro.dormir();
        perro.emitirSonido();

        // Instanciar un gato
        Gato gato = new Gato("Negro", "Michi", 2);
        System.out.println("\n=== Gato ===");
        gato.comer();
        gato.dormir();
        gato.emitirSonido();
    }
}