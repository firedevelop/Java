package j0061_T10_VT07_Ejercicio_12C_ArithmeticException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[5];
        Scanner scanner = new Scanner(System.in);
        int i;

        do {
            System.out.println("Introduce otro número. Para salir, introduce -1:");
            try {
                if (!scanner.hasNextInt()) {
                    throw new IllegalArgumentException("Entrada no válida. Debes introducir un número.");
                }

                i = scanner.nextInt();

                if (i == -1) {
                    break; // Salir del bucle si el usuario introduce -1
                }

                if (i > 4) { // Cambiar la validación de rango a <= 4 porque el array tiene índices de 0 a 4
                    throw new ArithmeticException("Número demasiado grande. Debes introducir un número entre 0 y 4.");
                }

                ints[i] = i; // Asignar el número al array

            } catch (ArithmeticException ex) {
                System.out.println("Error aritmético: " + ex.getMessage());
                i = 0; // Asegurar que `i` tiene un valor válido para no afectar el flujo
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Excepción fuera de índice: " + ex.getMessage());
                i = 0; // Misma precaución que antes
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
                scanner.next(); // Consumir el token no válido para evitar un bucle infinito
                i = 0;
            } finally {
                System.out.println("Última entrada procesada.");
            }
        } while (true);

        scanner.close();

        System.out.println("Números introducidos en el array:");
        for (int j = 0; j < ints.length; j++) {
            System.out.println("Índice " + j + ": " + ints[j]);
        }
    }
}


/*
*** ENTRADA VALIDA:
Introduce otro número. Para salir, introduce -1:
2
Última entrada procesada.
Introduce otro número. Para salir, introduce -1:
4
Última entrada procesada.
Introduce otro número. Para salir, introduce -1:
-1
Última entrada procesada.
Números introducidos en el array:
Índice 0: 0
Índice 1: 0
Índice 2: 2
Índice 3: 0
Índice 4: 4

*** ENTRADA INVALIDA:
Introduce otro número. Para salir, introduce -1:
abc
Error: Entrada no válida. Debes introducir un número.
Última entrada procesada.
Introduce otro número. Para salir, introduce -1:
5
Error aritmético: Número demasiado grande. Debes introducir un número entre 0 y 4.
Última entrada procesada.
Introduce otro número. Para salir, introduce -1:
-1
Última entrada procesada.
Números introducidos en el array:
Índice 0: 0
Índice 1: 0
Índice 2: 0
Índice 3: 0
Índice 4: 0

 */

