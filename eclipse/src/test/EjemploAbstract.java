package test;

// Clase abstracta
 abstract class Animal {
    // Método abstracto
    abstract void hacerSonido() {

    }

    // Método concreto
    void dormir() {
        System.out.println("El animal está durmiendo");*p-e
    }
}

// Subclase concreta
class Perro extends Animal {
    // Implementación del método abstracto
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class EjemploAbstract {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.dormir();


        }
    }
}
