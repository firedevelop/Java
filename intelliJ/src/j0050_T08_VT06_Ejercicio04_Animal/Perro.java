package j0050_T08_VT06_Ejercicio04_Animal;
// Clase derivada Perro
public class Perro extends Animal {
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

    // Sobrescribir emitirSonido
    @Override
    public void emitirSonido() {
        System.out.println("Guau!");
    }
}
