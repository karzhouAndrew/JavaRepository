package lab15;

import java.util.Arrays;

/* Задание 15. Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */
public class Task15 {
    public static void main(String[] args) {
        final int SIZE = 7;
        int[][] butterfly = new int[SIZE][SIZE];
        for (int i = 0; i <= SIZE / 2; i++) {
            for (int j = i; j < SIZE - i; j++) {
                butterfly[i][j] = 1;
                butterfly[SIZE - 1 - i][j] = 1;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.println(Arrays.toString(butterfly[i]));
        }
    }
}