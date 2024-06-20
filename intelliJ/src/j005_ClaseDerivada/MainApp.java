package j005_ClaseDerivada;
import java.text.ParseException;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        System.out.println("Empleado1: " + empleado1.getName() + ", " + empleado1.getPassport() + ", " + empleado1.getSalary() + ", " + empleado1.getBirthDay());

        Date fechaNac = new Date();
        Empleado empleado2 = new Empleado("12345678A", "Mery", 2000, fechaNac);
        System.out.println("Empleado2: " + empleado2.getName() + ", " + empleado2.getPassport() + ", " + empleado2.getSalary() + ", " + empleado2.getBirthDay());

        Empresa empresa = new Empresa(empleado2, 123456789, "Wall Street 100");
        System.out.println("Empresa: " + empresa.emp.getName() + ", " + empresa.telefono + ", " + empresa.direccion);

        double horasExtras = empresa.horasExtras(10);
        System.out.println("Horas extras: " + horasExtras);

        try {
            Date fechaFormateada = empresa.fechaNac("15/06/1985");
            System.out.println("Fecha formateada: " + fechaFormateada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crear una instancia de ClaseDerivada y mostrar la información
        ClaseDerivada claseDerivada = new ClaseDerivada(empleado2, 987654321, "Quinta Avenida 10");
        claseDerivada.mostrarInformacion();
    }
}
