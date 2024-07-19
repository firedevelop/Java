package j0031_Collection_Iterator;
import java.util.Iterator;
import java.util.LinkedList;

public class Iterator2 {
    public static void main(String[] args) {
        // Instancia de tipo específico
        LinkedList<String> listaEn = new LinkedList<>();
        listaEn.add("Maria");
        listaEn.add("Carlos");
        listaEn.add("Marc");
        listaEn.add("Lucia");

        // Crear un iterador
        Iterator<String> it = listaEn.iterator();

        // Iterar sobre la lista y eliminar elementos que contengan 'a'
        while(it.hasNext()) {
            String elemento = it.next();
            System.out.println("Iterando: " + elemento);
            if (elemento.contains("a")) {
                it.remove();
                System.out.println("Elemento eliminado: " + elemento);
            }
        }

        // Imprimir la lista después de eliminar elementos
        System.out.println("Lista después de la eliminación: " + listaEn);
    }
}
