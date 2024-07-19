package j0016_abstract;

class EmpleadoMedioTiempo extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, int id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}
