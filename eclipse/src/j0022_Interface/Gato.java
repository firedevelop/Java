package j0022_Interface;

public class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato hace: Miau Miau");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo");
    }
}
