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
        boolean flagMax = false;
        boolean flagMin = false;
        arrayRandom[0] = rand.nextInt(101);
        for (int i = 1; i < arrayRandom.length; i++) {
            arrayRandom[i] = rand.nextInt(101);
            if (arrayRandom[maxIndex] < arrayRandom[i]) {
                maxIndex = i;
                flagMax = true;
            } else if (arrayRandom[minIndex] > arrayRandom[i]) {
                minIndex = i;
                flagMin = true;
            } else if (arrayRandom[maxIndex] == arrayRandom[i]) {
                flagMax = false;
            } else if (arrayRandom[minIndex] == arrayRandom[i]) {
                flagMin = false;
            }
        }
        System.out.println(Arrays.toString(arrayRandom));
        int sum = 0;
        if (flagMax && flagMin) {
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
            System.out.println("Сумма между " + start + " и " + (finish + 1) + " элементами равна " + sum);
        } else {
            System.out.print("Невозможно выполнить сумму. В массиве есть одинаковые ");
            if (!flagMax) {
                System.out.println("максимальные числа.");
            } else {
                System.out.println("минимальные числа.");
            }
        }
    }
}
