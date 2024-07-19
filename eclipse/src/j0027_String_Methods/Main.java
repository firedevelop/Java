package j0027_String_Methods;

public class Main {
    public static void main(String[] args) {
        // Declaración de un array que pasaremos a String
        char[] array = new char[]{'l', 'i', 't', 'e', 'r', 'a', 'l'};

        // Formas de declarar un String
        String text1 = new String("literal_cadena_caracteres"); // Crear un String a partir de una cadena de caracteres
        String text2 = "literal_cadena_caracteres"; // Crear un String directamente
        String text3 = new String(array); // Crear un String a partir de un array de caracteres
        String text4 = new String(text2); // Crear un String a partir de otro String

        // Mostrar las diferentes formas de crear un String
        System.out.println("text1: " + text1);
        System.out.println("text2: " + text2);
        System.out.println("text3: " + text3);
        System.out.println("text4: " + text4);

        // Usando métodos de la clase String

        // char charAt (int indice) - Devuelve el carácter en la posición especificada
        char charAtExample = text1.charAt(3);
        System.out.println("charAt(3) de text1: " + charAtExample);

        // int compareTo (String cadena) - Compara dos Strings lexicográficamente
        int compareToExample = text1.compareTo(text2);
        System.out.println("compareTo(text2) de text1: " + compareToExample);

        // int compareToIgnoreCase (String cadena) - Compara dos Strings lexicográficamente, ignorando mayúsculas y minúsculas
        int compareToIgnoreCaseExample = text1.compareToIgnoreCase("LITERAL_CADENA_CARACTERES");
        System.out.println("compareToIgnoreCase(\"LITERAL_CADENA_CARACTERES\") de text1: " + compareToIgnoreCaseExample);

        // Boolean equals (Object objeto) - Comprueba si dos Strings son iguales
        boolean equalsExample = text1.equals(text2);
        System.out.println("equals(text2) de text1: " + equalsExample);

        // int indexOf (int carácter) - Devuelve la posición de la primera aparición del carácter especificado
        int indexOfExample = text1.indexOf('a');
        System.out.println("indexOf('a') de text1: " + indexOfExample);

        // boolean isEmpty () - Comprueba si el String está vacío
        boolean isEmptyExample = text1.isEmpty();
        System.out.println("isEmpty() de text1: " + isEmptyExample);

        // int length () - Devuelve la longitud del String
        int lengthExample = text1.length();
        System.out.println("length() de text1: " + lengthExample);

        // String replace (char caracterAntiguo, char caracterNuevo) - Reemplaza todas las apariciones de un carácter por otro
        String replaceExample = text1.replace('a', 'o');
        System.out.println("replace('a', 'o') de text1: " + replaceExample);

        // String[] split (String expresión) - Divide el String en partes usando la expresión regular especificada
        String[] splitExample = text1.split("_");
        System.out.print("split(\"_\") de text1: ");
        for (String part : splitExample) {
            System.out.print(part + " ");
        }
        System.out.println();

        // String toLowerCase () - Convierte todos los caracteres del String a minúsculas
        String toLowerCaseExample = text1.toLowerCase();
        System.out.println("toLowerCase() de text1: " + toLowerCaseExample);

        // String toUpperCase () - Convierte todos los caracteres del String a mayúsculas
        String toUpperCaseExample = text1.toUpperCase();
        System.out.println("toUpperCase() de text1: " + toUpperCaseExample);

        // String trim () - Elimina los espacios en blanco iniciales y finales del String
        String trimExample = "  " + text1 + "  ".trim();
        System.out.println("trim() de text1 con espacios: " + trimExample);

        // String valueOf (tipo variable) - Convierte diferentes tipos de datos a su representación en String
        int number = 123;
        String valueOfExample = String.valueOf(number);
        System.out.println("valueOf(123): " + valueOfExample);
    }
}
