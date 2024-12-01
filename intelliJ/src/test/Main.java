package test;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String cadena = "aabb"; // Cadena a evaluar
        Pattern pat = Pattern.compile("(a|b)+");
        Matcher mat = pat.matcher(cadena);

        if (mat.matches()) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
