package j005_ClaseDerivada;
public class ClaseDerivada extends Business {
    // Constructor
    public ClaseDerivada() {
        super(); // Llama al constructor de Empresa
    }

    public ClaseDerivada(Employee employee, int phone, String address) {
        super(employee, phone, address); // Llama al constructor de Empresa con parámetros
    }

    // Métodos adicionales específicos de ClaseDerivada
    public void mostrarInformacion() {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
