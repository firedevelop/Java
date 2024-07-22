package j0022_Interface;

public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: Guau Guau");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }
}
