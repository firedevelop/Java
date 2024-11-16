package j0052_VT06_Ejercicio10_Empleado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar los empleados
        Empleado[] empleados = new Empleado[5];

        // Solicitar al usuario que ingrese el nombre y el sueldo de cada empleado
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Introduzca el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Introduzcael sueldo del empleado " + (i + 1) + ":");
            double sueldo = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Crear un nuevo objeto Empleado y agregarlo al array
            empleados[i] = new Empleado(nombre, sueldo);
        }

        // Encontrar el empleado con el mayor sueldo
        Empleado empleadoMayorSueldo = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getSueldo() > empleadoMayorSueldo.getSueldo()) {
                empleadoMayorSueldo = empleados[i];
            }
        }

        // Imprimir el nombre y el sueldo del empleado con mayor sueldo
        System.out.println("Empleado con mayor sueldo:");
        System.out.println("Nombre: " + empleadoMayorSueldo.getNombre());
        System.out.println("Sueldo: " + empleadoMayorSueldo.getSueldo());
    }

}
