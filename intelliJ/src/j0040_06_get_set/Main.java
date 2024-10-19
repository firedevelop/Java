package j0040_06_get_set;

public class Main {
    public static void main(String[] args) {
        Profesores profesor = new Profesores();
        profesor.setNombre("john");
        profesor.setCurso("Java");

        double nota = profesor.Evaluar(10.00);
        System.out.println(profesor.getNombre());
        System.out.println(profesor.getCurso());
        System.out.println(profesor.Evaluar(nota));

    }
}

class Profesores { // Clase no pública
    private String nombre;
    private String curso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double Evaluar(double nota) {
        nota = nota * 0.8;
        return nota;
    }
}
