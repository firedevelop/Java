package codigo;

public class Animal {
    private String nombre;
    private int distancia;

    public Animal(String nombre) {
        this.nombre = nombre;
        this.distancia = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void correr(int metros) {
        this.distancia += metros;
    }
}
