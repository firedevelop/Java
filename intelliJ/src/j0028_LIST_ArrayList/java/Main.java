package j0028_LIST_ArrayList.java;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia de tipo Genérico
        List<Object> array = new ArrayList<>();
        array.add(2); // Valor entero
        array.add(4.3); // Valor decimal
        array.add("Hello World"); // Valor texto

        // Recorremos la colección con el método size()
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        // Instancia de tipo específico
        List<Integer> arrayEnteros = new ArrayList<>();
        arrayEnteros.add(2);
        arrayEnteros.add(3);
        arrayEnteros.add(4);

        // Recorremos la colección específica con el método size()
        for (int i = 0; i < arrayEnteros.size(); i++) {
            System.out.println(arrayEnteros.get(i));
        }
    }
}
