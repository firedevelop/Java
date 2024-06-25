package j007_Modifiers;

public class ClassA {
    public int publicVar;
    protected int protectedVar;
    int defaultVar; // package-private por defecto
    private int privateVar;

    public void publicMethod() {
        System.out.println("Public method in ClassA");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in ClassA");
    }

    void defaultMethod() {
        System.out.println("Default method in ClassA");
    }

    private void privateMethod() {
        System.out.println("Private method in ClassA");
    }
}
