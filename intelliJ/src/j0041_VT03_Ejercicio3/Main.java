package j0041_VT03_Ejercicio3;

public class Main{
    public static void main(String[] args) {
        Libro libro = new Libro("1234", "Garcia Marquez", "Cien años", 1990, "sm", 200);
        Libro libro2 = new Libro("222", "Garcia Marquez", "Cien años", 1990, "sm", 200);
        libro.getLibro();
        libro2.getLibro();
        libro.setCrearLibro();
    }
}