package j0051_VT06_Ejercicio9_Geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para almacenar los resultados
        int[] lado = new int[10];
        int[] radio = new int[10];
        int[][] baseAltura = new int[10][2];

        // Solicitar al usuario los datos
        System.out.println("Introduce los lados de los 10 cuadrados:");
        for (int i = 0; i < 10; i++) {
        	System.out.print("Lado " + i + ": ");
        	lado[i] = scanner.nextInt();
        	System.out.println();
        }
        System.out.println("Introduce los radios de los 10 círculos:");
        for (int i = 0; i < 10; i++) {
        	System.out.print("Radio " + i + ": ");
            radio[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Introduce las bases y alturas de los 10 triángulos:");
        for (int i = 0; i < 10; i++) {
      		System.out.print("Base " + i + ": ");
       		baseAltura[i][0] = scanner.nextInt();
       		System.out.print("\tAltura: " + i + ": ");
       		baseAltura[i][1] = scanner.nextInt();
            System.out.println();
       	}

        // Mostrar los resultados por consola
        System.out.println("Áreas de los cuadrados:");
        for (int i = 0; i < 10; i++) {
        	System.out.print("Área Cuadrado " + i + ": ");
            System.out.println(Geometria.areaCuadrado(lado[i]));
        }

        System.out.println("Áreas de los círculos:");
        for (int i = 0; i < 10; i++) {
        	System.out.print("Área Círculo " + i + ": ");
            System.out.println(Geometria.areaCirculo(radio[i]));
        }

        System.out.println("Áreas de los triángulos:");
        for (int i = 0; i < 10; i++) {
        	System.out.print("Área Triángulo " + i + ": ");
            System.out.println(Geometria.areaTriangulo(baseAltura[i][0],baseAltura[i][1]));
        }
    }
}
