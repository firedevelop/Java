package j0002_static_methods;

public class Main {
    public static void main(String[] args) {
        // Llamada al método estático sumar de la clase Calculadora
        int resultado = Calculadora.sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }
}
