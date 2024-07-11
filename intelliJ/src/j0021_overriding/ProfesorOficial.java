package j0021_overriding;
public class ProfesorOficial extends Profesor {
    // Constructor
    public ProfesorOficial(String dni, String nombre, int edad) {
        if (comprobarDNI(dni)) {
            super.dni = dni;
        } else {
            throw new IllegalArgumentException("DNI inválido para Pr" + dni);
        }
        super.nombre = nombre;
        super.edad = edad;
    }

    // Método para obtener la nota media
    public double getNotaMedia(double examen1, double examen2, double examen3, double examen4) {
        return pacs(examen1, examen2, examen3, examen4);
    }

    // Sobrescritura del método pacs de la clase padre
    @Override
    public double examenes(double examen1, double examen2, double examen3) {
        return ((examen1 + examen2 + examen3) / 3) + 0.6;
    }

    // Sobrecarga del método pacs para cuatro parámetros
    public double pacs(double examen1, double examen2, double examen3, double examen4) {
        return (examen1 + examen2 + examen3 + examen4) / 4;
    }
}
