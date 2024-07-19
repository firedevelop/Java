package j0028_Collection_List;
import java.util.ArrayList;
// get | indexOf | isEmpty | set | toArray

public class List_ArrayList {
    public static void main(String[] args) {
        // Crear una instancia de ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Agregar elementos a la lista
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Obtener el objeto en una posición específica (get)
        String fruitAtIndex2 = list.get(2);
        System.out.println("Fruit at index 2: " + fruitAtIndex2);

        // Obtener la posición de un objeto específico (indexOf)
        int indexOfBanana = list.indexOf("Banana");
        System.out.println("Index of 'Banana': " + indexOfBanana);

        // Verificar si la lista está vacía (isEmpty)
        boolean isListEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isListEmpty);

        // Sobrescribir un elemento en una posición específica (set)
        list.set(1, "Blueberry");
        System.out.println("List after setting index 1 to 'Blueberry': " + list);

        // Convertir la lista a un array (toArray)
        Object[] array = list.toArray();
        System.out.println("Array contents:");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
