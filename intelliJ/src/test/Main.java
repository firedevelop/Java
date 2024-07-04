package test;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[] array = new int[3];
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("num1: ");
        array[0] = sc.nextInt();

        System.out.println("num2");
        array[1] = sc.nextInt();

        array[2] = array[0] + array[1];
        System.out.println(array[0] + " + " + array[1] + " = " + array[2]);




    }
}