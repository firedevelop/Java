package J0032_Regex;// Se importa el paquete java.util.regex
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // Creamos el patrón
        Pattern patron = Pattern.compile(" ");
        // Creamos el Matcher a partir del patrón, la cadena como parámetro
        Matcher encaja = patron.matcher("hello world");
        // Invocamos el método replaceAll
        String resultado = encaja.replaceAll("_");
        System.out.println(resultado);
    }


}
