package test;
public interface Animal {
    void hacerSonido();
    void dormir();
    default void correr(){
        System.out.println("animal corre");
    }
}