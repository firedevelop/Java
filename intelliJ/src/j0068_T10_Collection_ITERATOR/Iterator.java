package j0068_T10_Collection_ITERATOR;

import java.util.LinkedList;

public class Iterator {
    public static void main(String[] args) {
        // Instancia de tipo específico
        LinkedList<String> listaEn = new LinkedList<>();
        listaEn.add("Maria");
        listaEn.add("Carlos");
        listaEn.add("Marc");
        listaEn.add("Lucia");

        // Crear un iterador
        java.util.Iterator<String> it = listaEn.iterator();

        // Iterar sobre la lista y imprimir cada elemento
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
