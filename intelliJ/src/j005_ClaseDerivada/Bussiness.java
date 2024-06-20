package j005_ClaseDerivada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bussiness {
    protected Employee employee; // Cambiado a protected para el acceso en ClaseDerivada
    protected int phone; // Cambiado a protected para el acceso en ClaseDerivada
    protected String address; // Cambiado a protected para el acceso en ClaseDerivada

    // Constructores
    public Bussiness() {
        employee = new Employee();
        phone = 900730222;
        address = "Gran Via 33";
    }

    public Bussiness(Employee employee) {
        this(employee, 900730222, "Sol 1");
    }

    public Bussiness(int phone, String address) {
        this(new Employee(), phone, address);
    }

    public Bussiness(Employee employee, int phone, String address) {
        this.employee = employee;
        this.phone = phone;
        this.address = address;
    }

    // Método cálculo horas extras Empleado
    public double horasExtras(double horas) {
        return employee.horasExtras(horas);
    }

    // Método que da formato a la fecha
    public Date fechaNac(String fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(fecha);
    }
}
