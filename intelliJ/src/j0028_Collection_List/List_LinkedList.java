package j0028_Collection_List;
import java.util.HashSet;
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

    public static class List_HashSet {
        public static void main(String[] args){
    //Instancia de tipo Genérico
            HashSet colSet = new HashSet();
            colSet.add(3);
            colSet.add(5.8);
            colSet.add("Hello world");
    //Como utilizar los métodos isEmpty() y el método clear()
            while(!colSet.isEmpty()){
                System.out.println(colSet);
                colSet.clear();
            }
    //Instancia de tipo específico
            HashSet<Double> colSetInt =new HashSet<Double>();
            colSetInt.add(23.10);
            colSetInt.add(32.00);
            colSetInt.add(83.24);
    //Recorrer la colección con un bucle for each
            for(Double s : colSetInt){
                System.out.println(s);
            }
        }
    }
}
