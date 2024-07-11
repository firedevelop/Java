package j0023_Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaramos el array
        int[] array = new int[3];
        int num;
        Scanner sc = new Scanner(System.in);

        // Inicializamos el primer elemento
        System.out.println("Introduzca el primer número:");
        num = sc.nextInt();
        array[0] = num;

        // Inicializamos el segundo elemento del array
        System.out.println("Introduzca el segundo número:");
        num = sc.nextInt();
        array[1] = num;

        // Realiza la suma de dos posiciones
        array[2] = array[0] + array[1];

        // Mostramos el resultado
        System.out.println(array[0] + " + " + array[1] + " = " + array[2]);

        sc.close();  // Cerramos el Scanner para liberar recursos
    }
}
