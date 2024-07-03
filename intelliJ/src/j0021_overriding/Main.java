package j0021_overriding;
public class Main {
    public static void main(String[] args) {
        try {
            // Crear instancia de ProfesorOficial
            ProfesorOficial profesorOficial = new ProfesorOficial("48566221F", "Ana Gomez", 35);
            System.out.println("ProfesorOficial");
            profesorOficial.getNotaMedia(5, 5, 6, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Crear instancia de ProfesorInterino
            ProfesorInterino profesorInterino = new ProfesorInterino("45633254L", "Adrián García", 29);
            System.out.println("ProfesorInterino");
            profesorInterino.getNotaMedia(9, 9, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
