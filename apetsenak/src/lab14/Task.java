package lab14;

import java.util.Arrays;
import java.util.Random;

/**
 * Определите сумму элементов одномерного массива,
 * расположен-ных между минимальным и максимальным значениями.
 */
public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;
        int minValue = 20;
        int maxValue = 0;
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
            if (maxValue < array[i]) {
                maxValue = array[i];
                indexMax = i;
            }
            if (minValue > array[i]) {
                minValue = array[i];
                indexMin = i;
            }
        }
        System.out.println(Arrays.toString(array));
        if (indexMin > indexMax) {
            int temp = indexMin;
            indexMin = indexMax;
            indexMax = temp;
        }
        for (int i = indexMin + 1; i < indexMax; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }
}
