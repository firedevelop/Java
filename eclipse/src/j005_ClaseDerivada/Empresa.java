package j005_ClaseDerivada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empresa {
    protected Empleado emp; // Cambiado a protected para el acceso en ClaseDerivada
    protected int telefono; // Cambiado a protected para el acceso en ClaseDerivada
    protected String direccion; // Cambiado a protected para el acceso en ClaseDerivada

    // Constructores
    public Empresa() {
        emp = new Empleado();
        telefono = 900730222;
        direccion = "Turó Gardeny 25003 Lleida";
    }

    public Empresa(Empleado e) {
        this(e, 900730222, "Turó Gardeny 25003 Lleida");
    }

    public Empresa(int tel, String dir) {
        this(new Empleado(), tel, dir);
    }

    public Empresa(Empleado e, int tel, String dir) {
        emp = e;
        telefono = tel;
        direccion = dir;
    }

    // Método cálculo horas extras Empleado
    public double horasExtras(double horas) {
        return emp.horasExtras(horas);
    }

    // Método que da formato a la fecha
    public Date fechaNac(String fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(fecha);
    }
}
