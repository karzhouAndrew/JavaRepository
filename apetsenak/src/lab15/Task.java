package lab15;

import java.util.Scanner;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой».
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы : ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            if (i < (size - i)) {
                for (int j = i; j < (size - i); j++) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = size - i - 1; j < i + 1; j++) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
