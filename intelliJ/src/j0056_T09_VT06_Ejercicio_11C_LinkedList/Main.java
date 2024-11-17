package j0056_T09_VT06_Ejercicio_11C_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Declarar un LinkedList de caracteres
        LinkedList<Character> lista = new LinkedList<>();

        // Insertar tres caracteres: c, d y f
        lista.add('c');
        lista.add('d');
        lista.add('f');
        System.out.println("Lista inicial: " + lista);

        // Añadir los caracteres a y b al principio de la lista
        lista.addFirst('b');
        lista.addFirst('a');
        System.out.println("Lista después de añadir a y b al principio: " + lista);

        // Añadir un carácter g al final de la lista
        lista.addLast('g');
        System.out.println("Lista después de añadir g al final: " + lista);

        // Añadir un carácter e entre los caracteres d y f
        lista.add(4, 'e'); // Índice 4 entre d (índice 3) y f (índice 4 original)
        System.out.println("Lista después de añadir e entre d y f: " + lista);

        // Eliminar el carácter de la tercera posición (índice 2)
        lista.remove(2);
        System.out.println("Lista después de eliminar el carácter en la posición 3 (índice 2): " + lista);
    }
}


/*
OUTPUT:

Lista inicial: [c, d, f]
Lista después de añadir a y b al principio: [a, b, c, d, f]
Lista después de añadir g al final: [a, b, c, d, f, g]
Lista después de añadir e entre d y f: [a, b, c, d, e, f, g]
Lista después de eliminar el carácter en la posición 3 (índice 2): [a, b, d, e, f, g]

 */