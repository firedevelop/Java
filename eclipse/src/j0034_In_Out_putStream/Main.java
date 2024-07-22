package j0034_In_Out_putStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static final String pathFile = "src/j0034_In_Out_putStream/test.txt"; // Use final for constant path

    public static void main(String[] args) {
        Leer leer = new Leer();
        Escribir escribir = new Escribir();
        escribir.escribir();
        leer.leer();
    }
}

class Leer {
    public void leer() {
        try (FileReader doc = new FileReader(Main.pathFile);
             BufferedReader docBuffer = new BufferedReader(doc)) { // Use try-with-resources
            String txt;
            while ((txt = docBuffer.readLine()) != null) {
                System.out.println(txt);
            }
        } catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}

class Escribir {
    public void escribir() {
        // Generate timestamp
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = "\n" + now.format(formatter);

        try (FileWriter doc = new FileWriter(Main.pathFile, true)) { // Use try-with-resources
            doc.write(timestamp.toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
