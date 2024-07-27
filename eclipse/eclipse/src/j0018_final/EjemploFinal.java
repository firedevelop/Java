package j0018_final;

// Clase final
final class Empleado {
    // Variable final
    private final String nombre;
    private final int id;
    private static int contadorEmpleados = 0;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.id = ++contadorEmpleados;
    }

    // Método final
    public final void mostrarDetalles() {
        System.out.println("Empleado ID: " + id + ", Nombre: " + nombre);
    }

    // Método estático para obtener el número total de empleados
    public static int getNumeroEmpleados() {
        return contadorEmpleados;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}

public class EjemploFinal {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Alice");
        Empleado emp2 = new Empleado("Bob");

        emp1.mostrarDetalles();
        emp2.mostrarDetalles();

        System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
    }
}
