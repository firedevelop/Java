package j0019_synchronized;

class Contador {
    private int count = 0;

    // Método con bloque sincronizado
    public void incrementar() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Crear múltiples hilos que incrementan el contador
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int y = 0; y < 1000; y++) {
                contador.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        // Esperar a que ambos hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mostrar el valor del contador
        System.out.println("Valor final del contador: " + contador.getCount());
    }
}
