package lab14_version2;

import java.util.Arrays;
import java.util.Random;

/* Задание 14. Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями. */
/* КОНКРЕТИЗИРОВАЛ ЗАДАНИЕ: при наличии элементов с равными значениями в качестве границ суммируемого диапазона программа примет
   первый из равных минимальных и последний из равных максимальных; в сумму не включаю сами граничные элементы */
public class Task14_version2 {
    public static void main(String[] args) {
        final int SIZE = 12;
        int[] arrMinToMax = new int[SIZE];
        Random rand = new Random();
        for (int i = 0; i < SIZE; i++) {
            arrMinToMax[i] = rand.nextInt(10);
        }
        System.out.println("Исходный массив случайных чисел:\n" + Arrays.toString(arrMinToMax));
        int minIndex = 0;
        int minValue = arrMinToMax[0];
        for (int i = 0; i < SIZE; i++) {
            if (arrMinToMax[i] < minValue) {
                minValue = arrMinToMax[i];
                minIndex = i;
            }
        }
        System.out.println("Первый из элементов с минимальным значением " + minValue + " имеет индекс " + minIndex);
        int maxIndex = SIZE - 1;
        int maxValue = arrMinToMax[SIZE - 1];
        for (int i = SIZE - 1; i >= 0; i--) {
            if (arrMinToMax[i] > maxValue) {
                maxValue = arrMinToMax[i];
                maxIndex = i;
            }
        }
        System.out.println("Последний из элементов с максимальным значением " + maxValue + " имеет индекс " + maxIndex);
        int startOfRange;
        int endOfRange;
        if (minIndex < maxIndex) {
            startOfRange = minIndex;
            endOfRange = maxIndex;
        } else {
            startOfRange = maxIndex;
            endOfRange = minIndex;
        }
        int sum = 0;
        for (int i = startOfRange + 1; i < endOfRange; i++) {
            sum += arrMinToMax[i];
        }
        System.out.println("Сумма элементов массива между ними (не включая сами граничные элементы) равна: " + sum);
    }
}