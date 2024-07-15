package j0030_Collection_Map;
import java.util.Map;
import java.util.HashMap;
public class Map_HashMap{
    public static void main(String[]args){
//Instancia de tipo genérico
        HashMap alumno = new HashMap();
        alumno.put(1,15.55);
        alumno.put(2.2,19);
        alumno.put("3","María");
        System.out.println(alumno);
//Eliminar un elemento
        alumno.remove("3");
        System.out.println(alumno);
//Sustituir un elemento
        alumno.put("1","Marc");
        System.out.println(alumno);
//Instancia de tipo específico
        HashMap<Integer,String> alum;
        alum = new HashMap<Integer,String>();
        alum.put(1,"Joan");
        alum.put(2,"Sara");
        alum.put(3,"Lola");
//Recorremos la colección con entrySet()
        for(Map.Entry<Integer,String>ent:alum.entrySet()){
            System.out.print("Clave: "+ ent.getKey() + "");
            System.out.println("Valor: "+ ent.getValue());
        }
    }
}