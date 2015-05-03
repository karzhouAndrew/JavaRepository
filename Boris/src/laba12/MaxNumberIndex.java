package laba12;

//Find index max number from sequence.

import java.util.Arrays;
import java.util.Random;

public class MaxNumberIndex {
    public static void main(String[] args) {
        int quantityNumber = 7;
        int[] arrayNumber = new int[quantityNumber];
        Random rand = new Random();
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = rand.nextInt(100);
        }
        int maxIndex = 0;
        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[maxIndex] < arrayNumber[i]) {
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("Максимальное число равно " + arrayNumber[maxIndex] + " и сожержиться в " + (maxIndex + 1) + " ячейке.");
    }
}
