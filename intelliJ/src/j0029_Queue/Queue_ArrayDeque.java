package j0029_Queue;
import java.util.ArrayDeque;

public class Queue_ArrayDeque {
    public static void main(String[] args) {
        // Instancia de tipo Genérico
        ArrayDeque<Object> cola = new ArrayDeque<>();
        cola.add("primer elemento");
        cola.add(2);
        cola.add("tercer elemento");
        cola.add(4);
        System.out.println("Cola inicial: " + cola);

        // Remover el primer elemento
        cola.pollFirst();
        System.out.println("Después de pollFirst(): " + cola);

        // Remover el último elemento
        cola.pollLast();
        System.out.println("Después de pollLast(): " + cola);

        // Instancia de tipo específico
        ArrayDeque<Integer> pila = new ArrayDeque<>();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        System.out.println("Pila inicial: " + pila);

        // Añadir un elemento al principio de la pila
        pila.push(0);
        System.out.println("Después de push(0): " + pila);

        // Remover el primer elemento de la pila
        pila.pop();
        System.out.println("Después de pop(): " + pila);
    }
}
