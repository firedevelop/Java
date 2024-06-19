package j005_ClaseDerivada;
import java.util.Date;

public class Empleado {
    // Atributos
    private String dni;
    private String nombre;
    private double sueldo;
    private Date fechaNac;

    // Constructores
    public Empleado() {
        this.dni = "00000000I";
        this.nombre = "Ilerna Online";
        this.sueldo = 1000;
        this.fechaNac = new Date();
    }

    public Empleado(String dni, String nombre, double sueldo, Date fn) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaNac = fn;
    }

    // Métodos GET y SET
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFechaNac() { return fechaNac; }
    public void setFechaNac(Date fn) { this.fechaNac = fn; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    // Métodos
    public double horasExtras(double horas) {
        double PrecioHora = 11;
        double extras = horas * PrecioHora;
        return extras;
    }
}
