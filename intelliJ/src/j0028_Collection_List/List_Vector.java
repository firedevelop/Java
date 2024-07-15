package j0028_Collection_List;
import java.util.Vector;

public class List_Vector {
    public static void main(String[] args) {
        // Crear un Vector
        Vector<String> vector = new Vector<>();

        // Agregar elementos al Vector
        vector.add("Elemento 1");
        vector.add("Elemento 2");
        vector.add("Elemento 3");

        // Obtener el primer elemento
        String firstElement = vector.firstElement();
        System.out.println("Primer elemento: " + firstElement);

        // Obtener el último elemento
        String lastElement = vector.lastElement();
        System.out.println("Último elemento: " + lastElement);

        // Obtener la capacidad del Vector
        int capacity = vector.capacity();
        System.out.println("Capacidad del Vector: " + capacity);

        // Ajustar el tamaño del Vector
        vector.setSize(5);
        System.out.println("Vector después de setSize(5): " + vector);

        // Ver la capacidad después de ajustar el tamaño
        int newCapacity = vector.capacity();
        System.out.println("Nueva capacidad del Vector: " + newCapacity);

        // Mostrar todos los elementos del Vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Elemento en posición " + i + ": " + vector.get(i));
        }
    }
}
