package extLab13;

import java.util.Arrays;

/**
 * Повернуть матрицу на 90 градусов
 */
public class Task {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        int counter = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = counter++;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
        for (int i = 0; i < (size - 1) / 2 + 1; i++) {
            for (int j = i; j < size - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[size - 1 - j][i];
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];
                matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];
                matrix[j][size - 1 - i] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
