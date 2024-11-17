package j0059_T10_VT07_Ejercicio_12B_Exception_Mail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, introduce tu email: ");
        String emailUsuario = scan.nextLine();
        scan.close(); // Cierra el Scanner para liberar recursos

        try {
            // Verifica el email ingresado
            verificarEmail(emailUsuario);
            System.out.println("La dirección es válida");
        } catch (EmailNoValidoException excep) {
            System.out.println(excep.getMessage());
        }
    }

    // Método para verificar si el email es válido
    public static void verificarEmail(String email) throws EmailNoValidoException {
        String expresion = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; // Expresión mejorada
        Pattern patron = Pattern.compile(expresion);
        Matcher comparador = patron.matcher(email);

        if (!comparador.matches()) {
            throw new EmailNoValidoException("La dirección " + email + " no es válida");
        }
    }
}

// Clase personalizada para excepciones de email
class EmailNoValidoException extends Exception {
    public EmailNoValidoException() {
        super("Email no válido");
    }

    public EmailNoValidoException(String mensaje) {
        super(mensaje);
    }
}
