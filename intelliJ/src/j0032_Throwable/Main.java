package j0032_Throwable;
import java.util.Scanner;

public class Main {

    // Método para verificar el login
    static boolean login(String user, String pass) {
        // Verifica si el usuario y la contraseña coinciden con los valores esperados
        if (user.equals("admin") && pass.equals("123")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Inicializar las variables
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String passwd = "";
        boolean valido = true;

        try {
            // Pedir los datos para el login
            System.out.println("User:");
            nombre = sc.nextLine();
            System.out.println("Password:");
            passwd = sc.nextLine();

            // Lanzar el método login
            if (!login(nombre, passwd)) {
                valido = false;
                throw new ErrorLoginException();
            }
        } catch (ErrorLoginException error) {
            // Código que se ejecutará si el código del bloque try lanza una excepción
            System.out.println(error.getMessage());
        } finally {
            // Código que se va ejecutar siempre (aunque se entre en el catch)
            if (valido) {
                System.out.println("Wellcome " + nombre);
            } else {
                System.out.println("reboot app and try again");
            }
        }

        sc.close(); // Cerrar el Scanner
    }
}
