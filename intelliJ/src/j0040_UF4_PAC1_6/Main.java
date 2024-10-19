package j0040_UF4_PAC1_6;

public class Main {
    private String nombre;
    private int edad;
    private String carrera;

    public Main(String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public void obternerInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
    }
    public void saludarProfesor(){
        System.out.println("Hola profesor, soy " + nombre + ". Hi man! \n");
    }

    public static void main(String[] args) {
        Main fernando = new Main("Fernando", 43, "Ingeniero Informatico");
        fernando.obternerInformacion();
        fernando.saludarProfesor();
    }
}