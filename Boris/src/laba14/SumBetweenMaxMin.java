package laba14;

import java.util.Arrays;
import java.util.Random;

//Find sum between max and min element of massive
public class SumBetweenMaxMin {
    public static void main(String[] args) {
        int quantityCell = 15;
        Random rand = new Random();
        int[] arrayRandom = new int[quantityCell];
        int maxIndex = 0;
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
        }
    }
}
