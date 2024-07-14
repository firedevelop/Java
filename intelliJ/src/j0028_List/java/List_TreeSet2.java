package j0028_List.java;
import java.util.TreeSet;

public class List_TreeSet2 {
    public static void main(String[] args) {
        // Instancia de tipo Genérico
        TreeSet<Integer> arbolPersonas = new TreeSet<>();
        arbolPersonas.add(3);
        arbolPersonas.add(45);
        arbolPersonas.add(72);

        // Vemos el funcionamiento del método tailSet()
        System.out.println("tailSet(1): " + arbolPersonas.tailSet(1));
        System.out.println("tailSet(20): " + arbolPersonas.tailSet(20));
        System.out.println("tailSet(50): " + arbolPersonas.tailSet(50));

        // Instancia de tipo específico
        TreeSet<String> arbolPer = new TreeSet<>();
        arbolPer.add("Sandra");
        arbolPer.add("Amanda");
        arbolPer.add("Diana");

        // Recorremos los resultados con un bucle for each
        System.out.println("TreeSet de cadenas:");
        for(String s : arbolPer) {
            System.out.println(s);
        }
    }
}
