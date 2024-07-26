package j0016_abstract;

class EjemploAbstract {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoTiempoCompleto("Alice", 1, 3000);
        Empleado empleado2 = new EmpleadoMedioTiempo("Bob", 2, 15, 120);

        System.out.println(empleado1.getNombre() + " tiene un salario de " + empleado1.calcularSalario());
        System.out.println(empleado2.getNombre() + " tiene un salario de " + empleado2.calcularSalario());
    }
}