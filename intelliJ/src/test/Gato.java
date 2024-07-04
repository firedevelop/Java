package test;
public class Gato implements Animal {
    @Override
    public void dormir() {
        System.out.println("gato duerme");
    }
    public void hacerSonido(){
        System.out.println("miau");
    }
}