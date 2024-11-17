package j0051_T09_VT06_Ejercicio08_Procesador_Cadenas;

import java.util.Scanner;

public class Main {
    private String cadena;

    // Constructor que inicializa la cadena ingresada por el usuario
    public Main(String cadena) {
        this.cadena = cadena;
    }

    // Método para contar el número de vocales en la cadena
    public int contarVocales() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e'
                    || Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o'
                    || Character.toLowerCase(caracter) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Método para invertir la cadena
    public String invertirCadena() {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }

    // Método para contar el número de apariciones de un carácter en la cadena
    public int contarApariciones(char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario una cadena de caracteres
        System.out.print("Introduce una cadena de caracteres: ");
        String entrada = scanner.nextLine();

        // Crear un objeto ProcesadorCadenas con la cadena ingresada
        Main procesador = new Main(entrada);

        // Contar el número de vocales en la cadena
        int numVocales = procesador.contarVocales();
        System.out.println("La cadena tiene " + numVocales + " vocales.");

        // Mostrar la cadena invertida
        String cadenaInvertida = procesador.invertirCadena();
        System.out.println("La cadena invertida es: " + cadenaInvertida);

        // Pedir al usuario un carácter para buscar en la cadena
        System.out.print("Introduce un carácter para buscar en la cadena: ");
        char caracter = scanner.next().charAt(0);

        // Contar el número de apariciones del carácter en la cadena
        int numApariciones = procesador.contarApariciones(caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + numApariciones + " veces en la cadena.");
        
        scanner.close();
    }
}

