package j0050_T08_VT06_Ejercicio07_Animal;

// Clase Gato que hereda de Animal e implementa ComportamientoAnimal
public class Gato extends Animal implements ComportamientoAnimal {
    public Gato(String color, String nombre, int edad) {
        super(color, nombre, edad);
    }

    // Implementación de los métodos de la interfaz
    @Override
    public void emitirSonido() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo pescado");
    }
}
