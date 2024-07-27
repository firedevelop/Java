package j0015_Protected;
import j0014_Protected.ClassA;
public class ClassB extends ClassA{
    public void testAccess(){
        this.protectedVar = 3;
        System.out.println("protectedVar: " + protectedVar);

        this.protectedMethod();

        ClassA objA = new ClassA();
        // objA.protectedVar = 5; // No access
        // objA.protectedMethod(); // No access
    }
}
