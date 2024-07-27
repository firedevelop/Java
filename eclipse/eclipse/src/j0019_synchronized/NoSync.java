package j0019_synchronized;

class Count {
    private int count = 0;

    // Método sincronizado
    public synchronized void incrementar() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class NoSync {
    public static void main(String[] args) {
        Count count = new Count();

        // Crear múltiples hilos que incrementan el count
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementar();
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

        // Mostrar el valor del count
        System.out.println("Valor final del count: " + count.getCount());
    }
}
