package j0053_T09_VT06_Ejercicio10_Empleado;

public class SueldoNoValidoException extends Exception {
    public SueldoNoValidoException() {
        super("Sueldo no válido.");
    }

    public SueldoNoValidoException(String mensaje) {
        super(mensaje);
    }
}
