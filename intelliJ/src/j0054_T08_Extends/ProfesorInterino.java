package j0054_T08_Extends;
public class ProfesorInterino extends Main {
    // Constructor
    public ProfesorInterino() {
        super.dni = "45633254L";
        super.nombre = "Adrián García";
        super.edad = 29;
    }

    // Método para calcular la nota media de 3 evaluaciones
    public double getNotaMedia(double pac1, double pac2, double pac3) {
        double notaMedia = super.pacs(pac1, pac2, pac3);
        System.out.println("Nota media del Profesor Interino: " + notaMedia);
        return notaMedia;
    }

    // Main para pruebas
    public static void main(String[] args) {
        ProfesorInterino p = new ProfesorInterino();
        System.out.println(p.getNotaMedia(6.5, 7, 8));
    }
}
