package j0030_Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapMethods {
    public static void main(String[] args) {
        // Crear un mapa
        Map<String, Integer> map = new HashMap<>();

        // Añadir pares clave-valor al mapa con put
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("tres", 3);

        // Obtener el valor correspondiente a una clave con get
        Integer valorDos = map.get("dos");
        System.out.println("Valor de la clave 'dos': " + valorDos);

        // Obtener todas las claves con keySet
        Set<String> claves = map.keySet();
        System.out.println("Claves en el mapa: " + claves);

        // Obtener todos los valores con values
        Collection<Integer> valores = map.values();
        System.out.println("Valores en el mapa: " + valores);

        // Obtener todos los pares clave-valor con entrySet
        Set<Map.Entry<String, Integer>> entradas = map.entrySet();
        System.out.println("Pares clave-valor en el mapa:");
        for (Map.Entry<String, Integer> entrada : entradas) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        // Ejemplo de reemplazar un valor existente
        map.put("dos", 22);
        System.out.println("Mapa después de reemplazar el valor de 'dos': " + map);
    }
}
