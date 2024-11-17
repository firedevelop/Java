package j0049_T08_Extends;
public class ProfesorOficial extends Main {
    // Constructor
    public ProfesorOficial() {
        super.dni = "48566221F";
        super.nombre = "Ana Gomez";
        super.edad = 35;
    }

    // Método para calcular la nota media de 4 evaluaciones
    public double getNotaMedia(double pac1, double pac2, double pac3, double pac4) {
        double notaMedia = pacs(pac1, pac2, pac3, pac4);
        System.out.println("Nota media del Profesor Oficial: " + notaMedia);
        return notaMedia;
    }

    // Método sobrescrito de la clase padre, es el 60% de la nota final
    @Override
    public double pacs(double pac1, double pac2, double pac3, double pac4) {
        double notaFinal = ((pac1 + pac2 + pac3 + pac4) / 4) * 0.6;
        return notaFinal;
    }

    // Main para pruebas
    public static void main(String[] args) {
        ProfesorOficial p = new ProfesorOficial();
        p.getNotaMedia(7.5, 8, 9, 10);
    }
}
