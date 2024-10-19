package j0038_Read_file;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class Main {
   public static final String pathFile = "src/j0038_Read_file/test.txt";

    public static void main(String[] args) {
        Escribir escribir = new Escribir();
        escribir.escribir();
    }

    static class Escribir {
        public void escribir(){
            // Generate timestamp
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = "\n" + now.format(formatter);

            try(FileWriter doc = new FileWriter(Main.pathFile, true) ){
               doc.write(timestamp);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}