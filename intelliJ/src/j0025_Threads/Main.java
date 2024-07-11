package j0025_Threads;

public class Main {
    public static void main(String[] args) {
        // Para los métodos notify(), notifyAll(), y wait(), necesitamos un objeto monitor
        Object monitor = new Object();

        // Ejemplo del método notify()
        Thread thread1 = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("Thread1 waiting...");
                    monitor.wait(); // Hace que el subproceso actual espere hasta que otro subproceso invoque notify()
                    System.out.println("Thread1 notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Ejemplo del método notifyAll()
        Thread thread2 = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("Thread2 waiting...");
                    monitor.wait(); // Hace que el subproceso actual espere hasta que otro subproceso invoque notify()
                    System.out.println("Thread2 notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        // Pause for a moment to ensure both threads are waiting
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            System.out.println("Main thread notifying all...");
            monitor.notifyAll(); // Despierta todos los hilos que están esperando en el monitor de este objeto
        }

        // Espera a que los hilos terminen
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Usar notify() en lugar de notifyAll() para despertar un solo hilo
        Thread thread3 = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("Thread3 waiting...");
                    monitor.wait(); // Hace que el subproceso actual espere hasta que otro subproceso invoque notify()
                    System.out.println("Thread3 notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread4 = new Thread(() -> {
            synchronized (monitor) {
                try {
                    System.out.println("Thread4 waiting...");
                    monitor.wait(); // Hace que el subproceso actual espere hasta que otro subproceso invoque notify()
                    System.out.println("Thread4 notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread3.start();
        thread4.start();

        // Pause for a moment to ensure both threads are waiting
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (monitor) {
            System.out.println("Main thread notifying one...");
            monitor.notify(); // Despierta un único hilo que está esperando en el monitor de este objeto
        }

        // Espera a que los hilos terminen
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
