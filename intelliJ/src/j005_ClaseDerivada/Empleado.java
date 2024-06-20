package j005_ClaseDerivada;
import java.util.Date;

public class Empleado {
    // Atributos
    private String passport;
    private String name;
    private double salary;
    private Date birthDay;

    // Constructor por Defecto
    public Empleado() {
        this.passport = "100200300";
        this.name = "John";
        this.salary = 1000;
        this.birthDay = new Date();
    }
    // Constructor Parametrizado
    public Empleado(String passport, String name, double salary, Date fn) {
        this.passport = passport;
        this.name = name;
        this.salary = salary;
        this.birthDay = fn;
    }

    // Métodos GET y SET
    public String getPassport() { return passport; }
    public void setPassport(String passport) { this.passport = passport; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Date getBirthDay() { return birthDay; }
    public void setBirthDay(Date birthDay) { this.birthDay = birthDay; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // Métodos
    public double horasExtras(double horas) {
        double PrecioHora = 11;
        double extras = horas * PrecioHora;
        return extras;
    }
}
