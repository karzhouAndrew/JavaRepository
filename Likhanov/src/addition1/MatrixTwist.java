package addition1;

import java.util.Arrays;

/**
 * turn the matrix into 90 degrees
 */
public class MatrixTwist {
    public static void main(String[] args) {
        int digit = 1;
        int lineIndex = 0;
        int[][] matrix = new int[3][3];
        int[][] bufferMatrix = new int[3][3];
        for (int i = 0; i < bufferMatrix.length; i++) {
            for (int j = 0; j < bufferMatrix.length; j++) {
                bufferMatrix[i][j] = digit;
                digit++;
            }
        }
        for (int i = 0; i < bufferMatrix.length; i++) {
            System.out.println(Arrays.toString(bufferMatrix[i]));
        }
        for (int i = 0; i < matrix.length; i++) {
            int columnIndex = 2;
            for (int j = 0; j < matrix.length; j++, columnIndex--) {

                matrix[i][j] = bufferMatrix[columnIndex][lineIndex];
            }
            lineIndex++;
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
