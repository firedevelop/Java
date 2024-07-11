package j0020_hotel_synchronized;

class Hotel {
    private int habitacionesDisponibles;

    public Hotel(int habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    // Método sincronizado para reservar una habitación
    public synchronized boolean reservarHabitacion() {
        if (habitacionesDisponibles > 0) {
            habitacionesDisponibles--;
            return true;
        } else {
            return false;
        }
    }

    // Método sincronizado para cancelar una reserva
    public synchronized void cancelarReserva() {
        habitacionesDisponibles++;
    }

    // Método para obtener el número de habitaciones disponibles
    public synchronized int getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }
}

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);

        // Crear múltiples hilos que intentan reservar habitaciones
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                if (hotel.reservarHabitacion()) {
                    System.out.println("Hilo 1 reservó una habitación");
                } else {
                    System.out.println("Hilo 1 no pudo reservar una habitación");
                }
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 7; i++) {
                if (hotel.reservarHabitacion()) {
                    System.out.println("Hilo 2 reservó una habitación");
                } else {
                    System.out.println("Hilo 2 no pudo reservar una habitación");
                }
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

        // Mostrar el número de habitaciones disponibles al final
        System.out.println("Habitaciones disponibles: " + hotel.getHabitacionesDisponibles());
    }
}
