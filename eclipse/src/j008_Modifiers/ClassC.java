package j008_Modifiers;

public class ClassC {
    public int publicVar;
    protected int protectedVar;
    int defaultVar; // package-private por defecto
    private int privateVar;

    public void publicMethod() {
        System.out.println("Public method in ClassC");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in ClassC");
    }

    void defaultMethod() {
        System.out.println("Default method in ClassC");
    }

    private void privateMethod() {
        System.out.println("Private method in ClassC");
    }
}
