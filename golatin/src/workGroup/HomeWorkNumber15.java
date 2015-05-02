package workGroup;

import java.util.Arrays;

/**
 * Created by User on 02.05.2015.
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
 */
public class HomeWorkNumber15 {
    public static void main(String[] args) {
        int size = 9;
        int arr[][] = new int[size][size];

        for (int i = 0; i <= arr.length >> 1; i++) {
            for (int k = i; k < arr.length - i; k++) {
                arr[i][k] = arr[arr.length - i - 1][k] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
