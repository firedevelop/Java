package j0050_T08_VT06_Ejercicio04_Animal;
public class Gato extends Animal {
    public Gato(String color, String nombre, int edad) {
        super(color, nombre, edad);
    }

    // Sobrescribir emitirSonido
    @Override
    public void emitirSonido() {
        System.out.println("Miau!");
    }

    // Sobrescribir comer
    @Override
    public void comer() {
        System.out.println("Comiendo pescado");
    }
}