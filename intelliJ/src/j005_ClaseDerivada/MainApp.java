package j005_ClaseDerivada;
import java.text.ParseException;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println("Empleado1: " + employee1.getName() + ", " + employee1.getPassport() + ", " + employee1.getSalary() + ", " + employee1.getBirthDay());


        Date birthDay = new Date();
        Employee employee2 = new Employee("12345678A", "Mery", 2000, birthDay);
        System.out.println("Empleado2: " + employee2.getName() + ", " + employee2.getPassport() + ", " + employee2.getSalary() + ", " + employee2.getBirthDay());

        Business business = new Business(employee2, 123456789, "Wall Street 100");
        System.out.println("Empresa: " + business.employee.getName() + ", " + business.phone + ", " + business.address);

        double horasExtras = business.horasExtras(10);
        System.out.println("Horas extras: " + horasExtras);
        double horasExtras2 = employee1.horasExtras(10);
        System.out.println("Horas extras2: " + horasExtras2);

        try {
            Date fechaFormateada = business.fechaNac("15/06/1985");
            System.out.println("Fecha formateada: " + fechaFormateada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crear una instancia de ClaseDerivada y mostrar la información
        ClaseDerivada claseDerivada = new ClaseDerivada(
                employee2, 987654321,
                "Quinta Avenida 10");
        claseDerivada.mostrarInformacion();
        ClaseDerivada claseDerivadaDefault = new ClaseDerivada();

    }
}
