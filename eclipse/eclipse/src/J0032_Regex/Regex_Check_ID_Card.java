package J0032_Regex;

import java.util.regex.*;

public class Regex_Check_ID_Card {
    public static void main(String[] args) {
        Regex_Check_ID_Card ejemplo = new Regex_Check_ID_Card();

        // Ejemplos de DNI para validar
        String[] dnis = {"12345678A", "87654321-Z", "1234567B", "ABCDEFG-H", "876543210X"};

        // Validar cada DNI
        for (String dni : dnis) {
            if (ejemplo.comprobarDNI(dni)) {
                System.out.println(dni + " es un DNI válido.");
            } else {
                System.out.println(dni + " no es un DNI válido.");
            }
        }
    }

    // Método para comprobar formato de DNI
    public boolean comprobarDNI(String dni) {
        // Expresión regular para el formato de DNI
        String regex = "^[0-9]{8}-?[a-zA-Z]{1}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(dni).matches();
    }
}

/*
EXPLANATION ^
Indica el inicio de la cadena. Esto asegura que la validación se realice desde el comienzo de la cadena.

EXPLANATION [0-9]{8}
[0-9]: Define un rango de caracteres que incluye cualquier dígito del 0 al 9.
{8}: Indica que debe haber exactamente 8 dígitos. En conjunto, [0-9]{8} asegura que los primeros 8 caracteres de la cadena sean dígitos.

EXPLANATION -?
-: Representa el carácter guion.
?: Indica que el guion es opcional y puede aparecer 0 o 1 vez. Esto permite cadenas con o sin un guion después de los 8 dígitos.

EXPLANATION [a-zA-Z]{1}
[a-zA-Z]: Define un rango de caracteres que incluye cualquier letra, ya sea minúscula (a-z) o mayúscula (A-Z).
{1}: Indica que debe haber exactamente una letra. En conjunto, [a-zA-Z]{1} asegura que el carácter final de la cadena sea una sola letra.

EXPLANATION $
Indica el final de la cadena. Esto asegura que no haya caracteres adicionales después de la letra.

Resumen
El regex ^[0-9]{8}-?[a-zA-Z]{1}$ valida cadenas que:

Empiezan con exactamente 8 dígitos.
Opcionalmente tienen un guion después de los 8 dígitos.
Terminan con una sola letra (mayúscula o minúscula).
Ejemplos de cadenas válidas:
12345678A
87654321-Z
12345678z
87654321Z
Ejemplos de cadenas inválidas:
1234567B (solo 7 dígitos)
ABCDEFG-H (letras en lugar de dígitos)
123456789A (9 dígitos en lugar de 8)
12345678-AB (dos letras en lugar de una)
12345678- (falta la letra final)

 */
