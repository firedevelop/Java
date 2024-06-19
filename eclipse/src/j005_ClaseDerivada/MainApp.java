package j005_ClaseDerivada;
import java.text.ParseException;
import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        // Crear una instancia de Empleado con el constructor por defecto
        Empleado empleado1 = new Empleado();
        System.out.println("Empleado1: " + empleado1.getNombre() + ", " + empleado1.getDni() + ", " + empleado1.getSueldo() + ", " + empleado1.getFechaNac());

        // Crear una instancia de Empleado con el constructor con parámetros
        Date fechaNac = new Date();
        Empleado empleado2 = new Empleado("12345678A", "Juan Pérez", 2000, fechaNac);
        System.out.println("Empleado2: " + empleado2.getNombre() + ", " + empleado2.getDni() + ", " + empleado2.getSueldo() + ", " + empleado2.getFechaNac());

        // Crear una instancia de Empresa
        Empresa empresa = new Empresa(empleado2, 123456789, "Calle Falsa 123");
        System.out.println("Empresa: " + empresa.emp.getNombre() + ", " + empresa.telefono + ", " + empresa.direccion);

        // Calcular horas extras para el empleado
        double horasExtras = empresa.horasExtras(10);
        System.out.println("Horas extras: " + horasExtras);

        // Dar formato a una fecha
        try {
            Date fechaFormateada = empresa.fechaNac("15/06/1985");
            System.out.println("Fecha formateada: " + fechaFormateada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Crear una instancia de ClaseDerivada y mostrar la información
        ClaseDerivada claseDerivada = new ClaseDerivada(empleado2, 987654321, "Avenida Siempre Viva 742");
        claseDerivada.mostrarInformacion();
    }
}
