package j0028_LIST_ArrayList.java;
import java.util.HashSet;
public class List_HashSet {
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