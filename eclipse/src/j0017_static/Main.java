package j0017_static;

class Empleado {
    // Variable estática para contar el número de empleados
    private static int contadorEmpleados = 0;

    // Variables de instancia
    private String nombre;
    private int id;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.id = ++contadorEmpleados; // Incrementa el contador y asigna el ID
    }

    // Método estático para obtener el número total de empleados
    public static int getNumeroEmpleados() {
        return contadorEmpleados;
    }

    // Métodos de instancia
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Empleado
        Empleado emp1 = new Empleado("Alice");
        Empleado emp2 = new Empleado("Bob");
        Empleado emp3 = new Empleado("Charlie");

        // Mostrar detalles de los empleados
        System.out.println(emp1.getNombre() + " tiene ID: " + emp1.getId());
        System.out.println(emp2.getNombre() + " tiene ID: " + emp2.getId());
        System.out.println(emp3.getNombre() + " tiene ID: " + emp3.getId());

        // Usar el método estático para obtener el número total de empleados
        System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
    }
}
