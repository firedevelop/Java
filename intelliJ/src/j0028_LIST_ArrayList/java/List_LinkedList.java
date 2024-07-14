package j0028_LIST_ArrayList.java;
import java.util.LinkedList;

public class List_LinkedList {
    public static void main(String[] args) {
        // Instancia de tipo Genérico
        LinkedList<Object> listaEnlazada = new LinkedList<>();
        listaEnlazada.add(3);
        listaEnlazada.add(4.52);
        listaEnlazada.add("Amaia");
        System.out.println(listaEnlazada);

        listaEnlazada.removeFirst();
        listaEnlazada.addFirst("Laura");
        listaEnlazada.addLast(72);
        System.out.println(listaEnlazada);

        // Instancia de tipo específico
        LinkedList<String> listaEnl = new LinkedList<>();
        listaEnl.add("Pablo");
        listaEnl.add("Carlos");
        listaEnl.add("Ruben");

        System.out.print(listaEnl.getFirst() + " ");
        System.out.println(listaEnl.getLast());
    }
}
