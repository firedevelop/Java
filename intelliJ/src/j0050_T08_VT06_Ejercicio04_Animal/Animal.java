package j0050_T08_VT06_Ejercicio04_Animal;
public class Animal {
    private String color;
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String color, String nombre, int edad) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println("Comiendo...");
    }

    public void dormir() {
        System.out.println("ZzZzZz");
    }

    public void emitirSonido() {
        System.out.println("Sonido!");
    }
}