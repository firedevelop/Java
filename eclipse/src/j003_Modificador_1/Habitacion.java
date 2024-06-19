package j003_Modificador_1;

class Habitacion extends Casa {

    String nombreHabitacion = "Sala de estar";

    @Override
    public void saludar() {
        System.out.println("¡Pasa a la sala de estar!");
    }

    public void mostrarDireccionCompleta() {
        mostrarDireccion(); // Acceso al método protegido
        System.out.println("... y dentro está la " + nombreHabitacion);
    }
}
