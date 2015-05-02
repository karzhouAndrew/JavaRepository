package workGroup;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 02.05.2015.
 * Повернуть квадратную матрицу
 */
public class HomeWorkNumber13Matrix {
    public static void main(String[] args) {
        int size = 8;
        int arr[][] = new int[size][size];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rn.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
        for (int i = 0; i < arr.length >> 1; i++) {
            for (int j = 0; j < arr[i].length % 2 + arr[i].length >> 1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][arr.length - i - 1];
                arr[j][arr.length - i - 1] = arr[arr.length - i - 1][arr.length - j - 1];
                arr[arr.length - i - 1][arr.length - j - 1] = arr[arr.length - j - 1][i];
                arr[arr.length - j - 1][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
