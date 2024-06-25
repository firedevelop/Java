package j009_Modifiers_Main;
import j007_Modifiers.ClassB;
import j008_Modifiers.ClassD;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing access in j007_Modifiers");
        ClassB objB = new ClassB();
        objB.testAccess();

        System.out.println("\nTesting access in j008_Modifiers");
        ClassD objD = new ClassD();
        objD.testAccess();
    }
}
