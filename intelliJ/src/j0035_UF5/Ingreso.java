package j0035_UF5;

public class Ingreso extends Dinero {
    private double ingreso;

    public Ingreso(double ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Ingreso{" +
                "ingreso=" + ingreso +
                '}';
    }
}
