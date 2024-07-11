package j0019_synchronized_2;
class Main {
    private static final Object monitor = new Object();
    private static boolean turn = true; // Control de turno

    public static void main(String[] args) {
        Thread thread1 = new Thread(new CounterRunnable(true), "Thread-1");
        Thread thread2 = new Thread(new CounterRunnable(false), "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class CounterRunnable implements Runnable {
        private final boolean isThread1;

        public CounterRunnable(boolean isThread1) {
            this.isThread1 = isThread1;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                synchronized (monitor) {
                    while (turn != isThread1) {
                        try {
                            monitor.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    turn = !turn;
                    monitor.notifyAll();
                }
            }
        }
    }
}
