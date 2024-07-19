package j0018_final;

class Padre {
    // Método final
    public final void metodoFinal() {
        System.out.println("Este es un método final en la clase Padre.");
    }
}

class Hijo extends Padre {
    // Intentar anular metodoFinal causará un error de compilación
    // public void metodoFinal() {
    //     System.out.println("Intentando anular el método final.");
    // }
}

public class EjemploFinalMetodos {
    public static void main(String[] args) {
        Hijo obj = new Hijo();
        obj.metodoFinal();
    }
}
