package j008_Modifiers;

import j007_Modifiers.ClassA;

public class ClassD extends ClassC {
    public void testAccess() {
        ClassC objC = new ClassC();

        // Accesos desde una subclase en el mismo paquete
        objC.publicVar = 1; // Accesible
        objC.protectedVar = 2; // Accesible
        objC.defaultVar = 3; // Accesible
        // objC.privateVar = 4; // No accesible fuera de ClassC

        objC.publicMethod(); // Accesible
        objC.protectedMethod(); // Accesible
        objC.defaultMethod(); // Accesible
        // objC.privateMethod(); // No accesible fuera de ClassC

        // Accesos a ClassA desde un paquete diferente
        ClassA objA = new ClassA();
        objA.publicVar = 1; // Accesible
        // objA.protectedVar = 2; // No accesible fuera del paquete, incluso para subclases
        // objA.defaultVar = 3; // No accesible fuera del paquete
        // objA.privateVar = 4; // No accesible fuera de ClassA

        objA.publicMethod(); // Accesible
        // objA.protectedMethod(); // No accesible fuera del paquete, incluso para subclases
        // objA.defaultMethod(); // No accesible fuera del paquete
        // objA.privateMethod(); // No accesible fuera de ClassA
    }
}
