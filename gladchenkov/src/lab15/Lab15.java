package lab15;

import java.util.Arrays;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабоч-кой», т.е таким образом:
 */
public class Lab15 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
                array[array.length - i - 1][j] = 1;
            }
        }
        for (int[] arrayElement : array) {
            System.out.println(Arrays.toString(arrayElement));
        }
    }
}