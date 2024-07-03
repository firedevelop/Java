package j0021_overriding;
public class ProfesorInterino extends Profesor {
    // Constructor
    public ProfesorInterino(String dni, String nombre, int edad) {
        if (comprobarDNI(dni)) {
            super.dni = dni;
        } else {
            throw new IllegalArgumentException("DNI inválido para ProfesorInterino: " + dni);
        }
        super.nombre = nombre;
        super.edad = edad;
    }

    // Método para obtener la nota media
    public double getNotaMedia(double pac1, double pac2, double pac3) {
        double notaMedia = super.examenes(pac1, pac2, pac3);
        System.out.println("Nota Media: " + notaMedia);
        return notaMedia;
    }
}
