package j0019_synchronized;

class ContadorIncorrecto {
    private int count = 0;

    public void incrementar() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class WrongMethodWithoutSynchronizing {
    public static void main(String[] args) {
        ContadorIncorrecto contadorIncorrecto = new ContadorIncorrecto();

        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contadorIncorrecto.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contadorIncorrecto.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valor final del contador: " + contadorIncorrecto.getCount());
    }
}
