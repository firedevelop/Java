package j0057_T09_VT06_Ejercicio_11D_ArrayList_LinkedList_Iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Crear y rellenar ArrayList
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('d');
        arrayList.add('e');
        arrayList.add('f');
        arrayList.add('g');

        // Crear y rellenar LinkedList
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('a');
        linkedList.add('b');
        linkedList.add('d');
        linkedList.add('e');
        linkedList.add('f');
        linkedList.add('g');

        // Recorrer ArrayList con un Iterador
        System.out.println("Recorriendo ArrayList con un Iterador:");
        Iterator<Character> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.print(arrayIterator.next() + " ");
        }
        System.out.println();

        // Recorrer LinkedList con un Iterador
        System.out.println("Recorriendo LinkedList con un Iterador:");
        Iterator<Character> linkedIterator = linkedList.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }
        System.out.println();
    }
}

/*
OUTPUT:
Recorriendo ArrayList con un Iterador:
a b d e f g
Recorriendo LinkedList con un Iterador:
a b d e f g

 */