package test;

public class Main{
    public static void main(String[] args) {
        int[] array = {};



        
        int a = array.hashCode();
        System.out.println(a);

        int[] a1 = {};
        int b = a1.hashCode();

        int[] a2 = {};
        int h2 = a2.hashCode();
        System.out.println(h2);


    }
}