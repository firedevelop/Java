package j0022_Interface;

public interface Animal {
    void hacerSonido();
    void dormir();

    default void correr() {
        System.out.println("El animal está corriendo");
    }
}
