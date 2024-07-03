package j0021_overriding;
public class Profesor {
    // Atributos
    protected String nombre;
    protected String dni;
    protected int edad;

    // Métodos
    public final boolean comprobarDNI(String dni) {
        // Implementación de la comprobación del DNI
        return dni != null && dni.matches("\\d{8}[A-Z]");
    }

    public double examenes(double examen1, double examen2, double examen3) {
        double nota_final = (examen1 + examen2 + examen3) / 3;
        return nota_final;
    }
}
