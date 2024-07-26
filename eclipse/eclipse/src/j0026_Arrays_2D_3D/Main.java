package j0026_Arrays_2D_3D;

public class Main {
    public static void main(String[] args) {
        int[][] doble = new int[3][3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                doble[i][j] = i + 1 + j * 3;
            }
        }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(doble[j][i] + " ");
            }
            System.out.println();
        }
    }
}