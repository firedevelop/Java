package j008_Modifiers;

public class ClassD extends ClassC {
    public void testAccess() {
        // Accesos a ClassA desde una subclase en un paquete diferente a través de ClassC
        this.publicVar = 1; // Accesible
        this.protectedVar = 2; // Accesible
        // this.defaultVar = 3; // No accesible fuera del paquete
        // this.privateVar = 4; // No accesible fuera de ClassA

        this.publicMethod(); // Accesible
        this.protectedMethod(); // Accesible
        // this.defaultMethod(); // No accesible fuera del paquete
        // this.privateMethod(); // No accesible fuera de ClassA
    }
}
