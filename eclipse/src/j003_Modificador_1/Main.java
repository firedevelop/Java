package j003_Modificador_1;
import j003_Modificador_2.Visitante;

public class Main {

    public static void main(String[] args) {
        Casa miCasa = new Casa();
        Habitacion miHabitacion = new Habitacion();
        Visitante visitante = new Visitante();

        miCasa.saludar();
        miHabitacion.saludar();
        miHabitacion.mostrarDireccionCompleta();
        visitante.visitarCasa();
    }
}
