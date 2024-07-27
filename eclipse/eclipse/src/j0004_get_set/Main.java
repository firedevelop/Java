package j0004_get_set;

public class Main {
    public static void main(String[] args) {
        Aula.main(args);
    }
}

class Aula {
    public static void main(String[] args) {
        double[] nota = new double[2];

        // Creación de objetos Alumno
        // Declaración del tipo de objeto = Alumno alumno1
        Alumno alumno1 = new Alumno("John", "Algorithms");
        Alumno alumno2 = new Alumno("Mery", "Calc");

        // Sintaxis de utilización de los métodos del objeto
        nota[0] = alumno1.evaluar(6.5);
        nota[1] = alumno2.evaluar(8);

        // Impresión de los Atributos del alumno
        System.out.println("Nombre: " + alumno1.getNombre() +
                " Curso: " + alumno1.getCurso() +
                " Nota: " + nota[0]);
        System.out.println("Nombre: " + alumno2.getNombre() +
                " Curso: " + alumno2.getCurso() +
                " Nota: " + nota[1]);
    }
}

class Alumno {
    // Atributos
    private String nombre;
    private String curso;

    // Constructor vacío
    public Alumno() {
        this.nombre = "Harvard";
        this.curso = "Online";
    }

    // Constructor con parámetros
    public Alumno(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    // Métodos GET y SET
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

    // Métodos creados por el programador
    public double evaluar(double nota) {
        nota = nota * 0.7;
        return nota;
    }
}
