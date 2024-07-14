package j0028_LIST_ArrayList.java;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        // Crear una instancia de TreeSet
        TreeSet<Integer> numeros = new TreeSet<>();

        // Agregar elementos al TreeSet
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Mostrar el primer elemento
        Integer firstElement = numeros.first();
        System.out.println("Primer elemento (first): " + firstElement);

        // Mostrar el último elemento
        Integer lastElement = numeros.last();
        System.out.println("Último elemento (last): " + lastElement);

        // Mostrar el mayor o igual elemento menor o igual a 25
        Integer floorElement = numeros.floor(25);
        System.out.println("Elemento floor(25): " + floorElement);

        // Mostrar el conjunto tailSet desde 30
        TreeSet<Integer> tailSetFrom30 = (TreeSet<Integer>) numeros.tailSet(30);
        System.out.println("tailSet(30): " + tailSetFrom30);

        // Otro ejemplo de tailSet desde 35 (no incluido en el conjunto)
        TreeSet<Integer> tailSetFrom35 = (TreeSet<Integer>) numeros.tailSet(35);
        System.out.println("tailSet(35): " + tailSetFrom35);
    }
}
