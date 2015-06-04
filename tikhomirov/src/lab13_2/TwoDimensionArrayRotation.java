package lab13_2;

/**
 * Перевернуть двухмерный массив.
 */
public class TwoDimensionArrayRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[][] matrixB = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++) {
                matrixB[j][matrix.length-1-i] = matrix[i][j];
            }
        System.out.println("Перевернутый массив");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrixB[i][j] + "   ");
            }
            System.out.println("  ");
        }
    }
}
