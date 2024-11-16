package j0054_T08_Extends;
public class Main {
    protected String dni;
    protected String nombre;
    protected int edad;

    // Método para calcular la media de 3 notas
    public double pacs(double pac1, double pac2, double pac3) {
        return (pac1 + pac2 + pac3) / 3;
    }

    // Método para calcular la media de 4 notas
    public double pacs(double pac1, double pac2, double pac3, double pac4) {
        return (pac1 + pac2 + pac3 + pac4) / 4;
    }
}