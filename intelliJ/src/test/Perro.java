package test;
public class Perro implements Animal{
    @Override
    public void hacerSonido(){
        System.out.println("gua");
    }
    public void dormir(){
        System.out.println("perro duerme");
    }

}