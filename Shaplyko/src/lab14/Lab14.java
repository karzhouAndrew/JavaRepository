package lab14;

import java.util.Arrays;

/**
 * Задание 14
 * Определите сумму элементов одномерного массива, расположен-ных между минимальным и максимальным значениями.
 */
public class Lab14 {
    public static void main(String[] args) {
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(marks));
        int maxMark = marks[0];
        int minMark = marks[0];
        int maxMarkInd = 0;
        int minMarkInd = 0;
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxMarkInd = i;
            }
            if (minMark > marks[i]) {
                minMark = marks[i];
                minMarkInd = i;
            }
        }
        System.out.println("Индекс максимального элемента = " + maxMarkInd + " Индекс минимального элемента = " + minMarkInd);
        int sum = 0;
        if (maxMarkInd > minMarkInd) {
            for (int i = minMarkInd + 1; i < maxMarkInd; i++) {
                sum += marks[i];
            }
        } else {                 //  второй цикл нужен, если индекс максимального элемента меньше индекса минимального
            for (int i = maxMarkInd + 1; i < minMarkInd; i++) {
                sum += marks[i];
            }
        }
        System.out.println("Сумма элементов, расположенных между максимальным и минимальным элементом = " + sum);

    }
}