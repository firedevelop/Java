package j0071_T11_FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public void lee() {
        try {
            FileReader doc = new FileReader("Prueba.txt");
            BufferedReader b_doc = new BufferedReader(doc);
            String txt = "";

            while (txt != null) {
                txt = b_doc.readLine();
                if (txt != null)
                    System.out.println(txt);
            }
            doc.close();
        } catch (IOException e) {
            System.out.println("No se ha encontrado el fichero");
            e.printStackTrace();
        }
    }
}
