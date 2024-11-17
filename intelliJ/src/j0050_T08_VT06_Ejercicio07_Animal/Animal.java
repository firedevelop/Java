package j0050_T08_VT06_Ejercicio07_Animal;

// Clase abstracta base
public abstract class Animal {
    private String color;
    private String nombre;
    private int edad;

    // Constructor
    public Animal(String color, String nombre, int edad) {
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método común para todas las clases derivadas
    public void dormir() {
        System.out.println("ZzZzZz");
    }
}
