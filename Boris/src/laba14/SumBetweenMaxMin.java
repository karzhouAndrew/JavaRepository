package laba14;

import java.util.Arrays;
import java.util.Random;

//Find sum between max and min element of massive
public class SumBetweenMaxMin {
    public static void main(String[] args) {
        int quantityCell = 15;
        Random rand = new Random();
        int[] arrayRandom = new int[quantityCell];
        //Another realization, take first Max or Min value
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayRandom));
        int sumMaxRight = 0;
        int sumMinRight = 0;
        int maxValue = arrayRandom[0];
        int minValue = arrayRandom[0];
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] > maxValue) {
                maxValue = arrayRandom[i];
                sumMaxRight = 0;
            } else {
                sumMaxRight += arrayRandom[i];
            }
            if (arrayRandom[i] < minValue) {
                minValue = arrayRandom[i];
                sumMinRight = 0;
            } else {
                sumMinRight += arrayRandom[i];
            }
        }
        if (sumMaxRight - sumMinRight < 0) {
            System.out.println(sumMinRight - sumMaxRight - maxValue);
        } else {
            System.out.println(sumMaxRight - sumMinRight - minValue);
        }


        /*int maxIndex = 0;
        int minIndex = 0;
        boolean isPairMax = false;
        boolean isPairMin = false;
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arrayRandom));
        for (int i = 1; i < arrayRandom.length; i++) {
            if (arrayRandom[maxIndex] < arrayRandom[i]) {
                maxIndex = i;
                isPairMax = false;
            } else if (arrayRandom[minIndex] > arrayRandom[i]) {
                minIndex = i;
                isPairMin = false;
            } else if (arrayRandom[maxIndex] == arrayRandom[i]) {
                isPairMax = true;
            } else if (arrayRandom[minIndex] == arrayRandom[i]) {
                isPairMin = true;
            }
        }
        int sum = 0;
        if (isPairMax || isPairMin) {
            System.out.print("Невозможно выполнить сумму. В массиве есть одинаковые ");
            if (isPairMax) {
                System.out.print("максимальные числа");
            }
            if (isPairMax && isPairMin) {
                System.out.print(" и ");
            }
            if (isPairMin) {
                System.out.print("минимальные числа");
            }
            System.out.println(".");

        } else {
            int start;
            int finish;
            if (minIndex < maxIndex) {
                start = minIndex + 1;
                finish = maxIndex;
            } else {
                start = maxIndex + 1;
                finish = minIndex;
            }
            for (int i = start; i < finish; i++) {
                sum += arrayRandom[i];
            }
            System.out.println("Сумма между " + start + " и " + (finish + 1) + " элементами равна " + sum + ".");
        }*/
    }
}
