package J015_Protected;
import J014_Protected.ClassA;
public class ClassB extends ClassA{
    public void testAccess(){
        this.protectedVar = 3;
        System.out.println("protectedVar: " + protectedVar);

        this.protectedMethod();

        ClassA objA = new ClassA();
        objA.protectedMethod();
    }
}
