package j0041_VT03_Ejercicio1;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Introduce operador:");
    String operador = scan.nextLine();
    System.out.println("has escrito: " + operador);
    scan.close();

    int counter = 0;
    Calculadora calculadora = new Calculadora(2,4);
    Calculadora calculadora1 = new Calculadora(1,3, operador);
    calculadora.getMultiplicacion();
    System.out.println("Counter: " + ++counter);
    calculadora1.getOperacion();
    System.out.println("Counter: " + ++counter);


}
}
