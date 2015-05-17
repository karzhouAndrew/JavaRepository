package addLab5;

import java.util.Arrays;
import java.util.Random;

/**
 * 5.	Дана действительная матрица порядка n.
 * Найти сум¬му элементов, расположенных в закрашенной части матрицы на рисунке
 */
public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[5][5];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
                if (j <= i) {
                    sum += matrix[i][j];
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("sum = " + sum);
    }
}
