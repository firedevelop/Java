package j003_Modificador_1;

class Casa {

    private String nombre = "Mi casa";

    String ubicacion = "Calle Mayor";

    protected void mostrarDireccion() {
        System.out.println("La dirección es: " + ubicacion);
    }

    public void saludar() {
        System.out.println("¡Bienvenido a mi casa!");
    }
}
