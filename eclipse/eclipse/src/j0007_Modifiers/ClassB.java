package j0007_Modifiers;

public class ClassB extends ClassA {
    public void testAccess() {
        ClassA objA = new ClassA();

        // Accesos desde la misma clase (ClassB está en el mismo paquete que ClassA)
        objA.publicVar = 1; // Accesible
        objA.protectedVar = 2; // Accesible
        objA.defaultVar = 3; // Accesible
        // objA.privateVar = 4; // No accesible fuera de ClassA

        objA.publicMethod(); // Accesible
        objA.protectedMethod(); // Accesible
        objA.defaultMethod(); // Accesible
        // objA.privateMethod(); // No accesible fuera de ClassA
    }
}
