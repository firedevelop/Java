package j0026_Arrays_2D_3D;
public class Array_3D {
    public static void main(String[] args) {
        int[][][] matriz = new int[3][3][3];

        // Llenar la matriz tridimensional
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matriz[i][j][k] = i + 1 + j * 3;
                }
            }
        }

        // Imprimir la matriz tridimensional
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int s = 0; s < 3; s++) {
                    System.out.print(matriz[s][j][i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
