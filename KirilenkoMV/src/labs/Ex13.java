package labs;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Kirilenko_MV on 29.04.2015.
 * Перевернуть одномерный массив. Повернуть квадратную матрицу.
 */
public class Ex13 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println();
        System.out.println();

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(9);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = i; j < arr.length - i - 1; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][arr.length - i - 1];
                arr[j][arr.length - i - 1] = arr[arr.length - i - 1][arr.length - j - 1];
                arr[arr.length - i - 1][arr.length - j - 1] = arr[arr.length - j - 1][i];
                arr[arr.length - j - 1][i] = tmp;
            }
        }

        System.out.println();
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
