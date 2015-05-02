package workGroup;

import java.util.Arrays;

/**
 * Created by User on 02.05.2015.
 * Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class HomeWorkNumber14 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        int min = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
            if (array[i] < array[min]) {
                min = i;
            }
        }
        int sum = 0;
        if (Math.abs(min - max) > 1) {
            for (int i = min > max ? min - 1 : min + 1; i != max; i = min > max ? i - 1 : i + 1) {
                sum += array[i];
            }
        }
        System.out.println("Сумма между минимумом " + array[min] + " и максимумом " + array[max] + " = " + sum);
    }
}
