package j0005_ClaseDerivada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Business {
    protected Employee employee; // Cambiado a protected para el acceso en ClaseDerivada
    protected int phone; // Cambiado a protected para el acceso en ClaseDerivada
    protected String address; // Cambiado a protected para el acceso en ClaseDerivada

    // Constructor 0 parametres
    public Business() {
        employee = new Employee();
        phone = 222;
        address = "Gran Via 222";
    }

    // Constructor 1 parametres. (Employee employee) en el constructor Business significa que, para crear un objeto Business, debes pasar un objeto de tipo Employee como argumento.
    public Business(Employee employee) {
        this(employee, 900730222, "Sol 1");
    }

    // Constructor 2 parametres
    public Business(int phone, String address) {
        this(new Employee(), phone, address);
    }

    // Constructor 3 parametres
    public Business(Employee employee, int phone, String address) {
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