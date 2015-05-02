package workGroup;

import java.util.Random;
import java.util.Arrays;

/**
 * Created by User on 02.05.2015.
 * Сумма матрицы ниже диагонали
 */
public class AdditionalJob5 {
    public static void main(String[] args) {
        int size = 3;
        int arr[][] = new int[size][size];
        Random rn = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                arr[i][k] = rn.nextInt(10);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k <= i; k++) {
                sum += arr[i][k];
            }
        }
        System.out.println(sum);


    }
}
