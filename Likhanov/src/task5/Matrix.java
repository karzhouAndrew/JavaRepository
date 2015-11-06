package task5;

import java.util.*;

/**
 * There is a real matrix wich consists of n lines and columns. Find out the sum of elements arranged in the shaded part of the matrix.
 */
public class Matrix {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number of lines and columns: ");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("The sum is " + sum);
    }
}
