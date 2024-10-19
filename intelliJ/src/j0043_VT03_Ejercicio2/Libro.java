package j0043_VT03_Ejercicio2;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String autor;
    private String titulo;
    private int year;
    private String editorial;
    private int numeroPaginas;

    public Libro(String ISBN, String autor, String titulo, int year, String editorial, int numeroPaginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.year = year;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
    }

    public void getLibro(){
        System.out.println("ISBN: " + ISBN);
        System.out.println("autor: " + autor);
        System.out.println("titulo: " + titulo);
        System.out.println("year: " + year);
        System.out.println("editorial: " + editorial );
        System.out.println("numeroPaginas: " + numeroPaginas + "\n");
    }

    public void setCrearLibro(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Intro ISBN:");
        String ISBN = scan.nextLine();
        System.out.println("Intro Autor:");
        String autor = scan.nextLine();
        System.out.println("Intro titulo:");
        String titulo = scan.nextLine();
        System.out.println("Intro year:");
        int year = scan.nextInt();

        System.out.println("Intro editorial:");
        String editorial = scan.nextLine();
        System.out.println("Intro numeroPaginas");
        int numeroPaginas = scan.nextInt();

        Libro libro3 = new Libro(ISBN, autor, titulo, year, editorial, numeroPaginas);
        libro3.getLibro();
    }

    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
}