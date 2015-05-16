package lab15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой».
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы : ");
        int size = sc.nextInt();
        sc.close();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = i; j < size - i; j++) {
                matrix[i][j] = 1;
                matrix[size - i - 1][j] = 1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
