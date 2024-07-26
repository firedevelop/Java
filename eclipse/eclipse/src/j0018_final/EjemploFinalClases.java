package j0018_final;

final class ClaseFinal {
    public void mostrarMensaje() {
        System.out.println("Esta es una clase final.");
    }
}

// Intentar extender ClaseFinal causará un error de compilación
// class SubClase extends ClaseFinal { }

public class EjemploFinalClases {
    public static void main(String[] args) {
        ClaseFinal obj = new ClaseFinal();
        obj.mostrarMensaje();
    }
}
