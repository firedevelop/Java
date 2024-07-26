package j0022_Interface;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido();
        perro.dormir();
        perro.correr();

        Animal gato = new Gato();
        gato.hacerSonido();
        gato.dormir();
        gato.correr();
    }
}
