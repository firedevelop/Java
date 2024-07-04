package j0024_Array_Methods;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Ejemplo del método length
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Length of array: " + array.length); // Obtiene la longitud de la matriz

        // Ejemplo del método clone()
        int[] arrayClone = array.clone();
        System.out.println("Array cloned: " + java.util.Arrays.toString(arrayClone)); // Crea y devuelve una copia del objeto

        // Ejemplo del método hashCode()
        int hashCode = array.hashCode();
        System.out.println("Hash code of array: " + hashCode); // Devuelve un valor de código hash para el objeto

        // Ejemplo del método toString()
        String arrayString = array.toString();
        System.out.println("String representation of array: " + arrayString); // Devuelve una representación de cadena del objeto

        // Ejemplo del método equals()
        boolean isEqual = array.equals(arrayClone);
        System.out.println("Array equals arrayClone: " + isEqual); // Indica si algún otro objeto es igual a este

        // Ejemplo del método getClass()
        Class<?> arrayClass = array.getClass();
        System.out.println("Class of array: " + arrayClass); // Devuelve la clase de tiempo de ejecución de este objeto

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
        Thread.sleep(1000);

        synchronized (monitor) {
            System.out.println("Main thread notifying all...");
            monitor.notifyAll(); // Despierta todos los hilos que están esperando en el monitor de este objeto
        }

        // Espera a que los hilos terminen
        thread1.join();
        thread2.join();

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
        Thread.sleep(1000);

        synchronized (monitor) {
            System.out.println("Main thread notifying one...");
            monitor.notify(); // Despierta un único hilo que está esperando en el monitor de este objeto
        }

        // Espera a que los hilos terminen
        thread3.join();
        thread4.join();
    }
}
