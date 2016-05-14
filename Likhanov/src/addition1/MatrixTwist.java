package addition1;

import java.util.Arrays;


/**
 * turn the matrix into 90 degrees
 */
public class MatrixTwist {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int n = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = n++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int tmp = array[i][j];
                array[i][j] = array[array[i].length - 1][j];
                array[array[i].length - 1][j] = tmp;
            }
        }
        System.out.println("2nd array.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
/*
int digit = 1;
int lineIndex = 0;
int[][] matrix = new int[7][7];
int[][] bufferMatrix = new int[7][7];
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
        int columnIndex = matrix.length - 1;
        for (int j = 0; j < matrix.length; j++, columnIndex--) {

        matrix[i][j] = bufferMatrix[columnIndex][lineIndex];
        }
        lineIndex++;
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
        System.out.println(Arrays.toString(matrix[i]));
        }
        */