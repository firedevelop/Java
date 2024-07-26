package j0035_UF5;

public class Gasto extends Dinero {
    private double gasto;

    public Gasto(double gasto, String description) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "gasto=" + gasto +
                '}';
    }
}
