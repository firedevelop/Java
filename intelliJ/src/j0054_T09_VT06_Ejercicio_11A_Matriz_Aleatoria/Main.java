package j0054_T09_VT06_Ejercicio_11A_Matriz_Aleatoria;
import java.util.Random;

public class Main {
    private int[][] matriz;

    // Constructor que rellena la matriz con números aleatorios
    public Main() {
        matriz = new int[2][3];
        Random rand = new Random();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }
    }

    // Método para imprimir la matriz por consola
    public void imprimirMatriz() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para imprimir la matriz junto con la suma de sus elementos
    public void imprimirMatrizConSumas() {
    	int total = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(" | " + sumarFila(i));
        }
        for (int j = 0; j < 30; j++) {
            System.out.print("-");
        }
        System.out.println();
        for (int j = 0; j < 3; j++) {
            System.out.print(sumarColumna(j) + "\t");
            total += sumarColumna(j);
        }
        System.out.println(" | " + total);
    }

    // Método para sumar los elementos de una fila
    private int sumarFila(int fila) {
        int suma = 0;
        for (int j = 0; j < 3; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // Método para sumar los elementos de una columna
    private int sumarColumna(int columna) {
        int suma = 0;
        for (int i = 0; i < 2; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Matriz:");
        main.imprimirMatriz();
        System.out.println("\nMatriz con sumas:");
        main.imprimirMatrizConSumas();
    }
}
