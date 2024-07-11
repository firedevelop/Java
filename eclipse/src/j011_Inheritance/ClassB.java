package j011_Inheritance;
import j010_Inheritance.ClassA;

public class ClassB extends ClassA {
    public void testAccess() {
        // Acceso a miembros protegidos de ClassA desde una subclase en un paquete diferente
        this.protectedVar = 10; // Accesible
        protectedVar = 3;
        System.out.println("protectedVar: " + this.protectedVar);

        this.protectedMethod(); // Accesible

        ClassA ObjA = new ClassA();
        // Los miembros protegidos de ClassA en la subclase ClassB solo a través de la herencia, no a través de una instancia de la superclase.
         // ObjA.protectedVar = 11; // No accesible
        // objA.protectedMethod(); // No accesible
        ObjA.publicMethod();
        ObjA.publicVar = 1;



    }
}
