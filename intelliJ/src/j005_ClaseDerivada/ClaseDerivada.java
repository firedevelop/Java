package j005_ClaseDerivada;
public class ClaseDerivada extends Empresa {
    // Constructor
    public ClaseDerivada() {
        super(); // Llama al constructor de Empresa
    }

    public ClaseDerivada(Empleado e, int tel, String dir) {
        super(e, tel, dir); // Llama al constructor de Empresa con parámetros
    }

    // Métodos adicionales específicos de ClaseDerivada
    public void mostrarInformacion() {
        System.out.println("Empleado: " + emp.getNombre());
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
    }
}
