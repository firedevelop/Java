package j0028_List.java;
import java.util.HashSet;

public class List_HashSet2 {
    public static void main(String[] args) {
        // Crear una instancia de HashSet
        HashSet<String> conjunto = new HashSet<>();

        // Verificar si el conjunto está vacío
        System.out.println("¿El conjunto está vacío? " + conjunto.isEmpty());

        // Agregar elementos al conjunto
        conjunto.add("Elemento A");
        conjunto.add("Elemento B");
        conjunto.add("Elemento C");

        // Verificar nuevamente si el conjunto está vacío
        System.out.println("¿El conjunto está vacío? " + conjunto.isEmpty());

        // Clonar el conjunto
        HashSet<String> conjuntoClonado = (HashSet<String>) conjunto.clone();

        // Mostrar el conjunto clonado
        System.out.println("Conjunto clonado: " + conjuntoClonado);

        // Limpiar el conjunto original
        conjunto.clear();

        // Mostrar el conjunto original después de limpiarlo
        System.out.println("Conjunto original después de clear(): " + conjunto);
    }
}
