package j0050_T08_VT06_Ejercicio07_Animal;

// Clase Perro que hereda de Animal e implementa ComportamientoAnimal
public class Perro extends Animal implements ComportamientoAnimal {
    private String raza;

    // Constructor con raza
    public Perro(String color, String nombre, int edad, String raza) {
        super(color, nombre, edad);
        this.raza = raza;
    }

    // Constructor sin raza
    public Perro(String color, String nombre, int edad) {
        super(color, nombre, edad);
    }

    // Getter para raza
    public String getRaza() {
        return raza;
    }

    // Implementación de los métodos de la interfaz
    @Override
    public void emitirSonido() {
        System.out.println("Guau!");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo...");
    }
}
