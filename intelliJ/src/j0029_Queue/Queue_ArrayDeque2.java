package j0029_Queue;

import java.util.ArrayDeque;

public class Queue_ArrayDeque2 {
    public static void main(String[] args) {
        // Instancia de ArrayDeque como Queue
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Añadir elementos al final de la cola
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println("Después de add: " + deque);

        // Añadir un elemento al inicio de la cola (similar a push)
        deque.push(0);
        System.out.println("Después de push(0): " + deque);

        // Remover y devolver el primer elemento de la cola (similar a pop)
        int firstElement = deque.pop();
        System.out.println("Elemento removido con pop(): " + firstElement);
        System.out.println("Después de pop(): " + deque);

        // Remover y devolver el primer elemento de la cola
        Integer pollFirstElement = deque.pollFirst();
        System.out.println("Elemento removido con pollFirst(): " + pollFirstElement);
        System.out.println("Después de pollFirst(): " + deque);

        // Remover y devolver el último elemento de la cola
        Integer pollLastElement = deque.pollLast();
        System.out.println("Elemento removido con pollLast(): " + pollLastElement);
        System.out.println("Después de pollLast(): " + deque);

        // Verificar si la cola está vacía
        boolean isEmpty = deque.isEmpty();
        System.out.println("¿La cola está vacía?: " + isEmpty);
    }
}
