package j003_Modificador_1;
import j003_Modificador_2.Visitante;

public class Main {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Habitacion miHabitacion = new Habitacion();
        Visitante visitante = new Visitante();

        casa.saludar();
        casa.mostrarDireccion();
        miHabitacion.saludar();
        miHabitacion.mostrarDireccionCompleta();
        visitante.visitarCasa();
    }
}
