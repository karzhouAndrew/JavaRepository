package laba13;

//Create massive and fill it random numbers. Turn over massive. 

import java.util.Arrays;
import java.util.Random;

public class TurnOutMassive {
    public static void main(String[] args) {
        Random rand = new Random();
        int lengthMassive = 9;
        int[] arrayStraight = new int[lengthMassive];
        for (int i = 0; i < arrayStraight.length; i++) {
            arrayStraight[i] = rand.nextInt(101);
        }
        System.out.println(Arrays.toString(arrayStraight));
        for (int i = 0; i < arrayStraight.length / 2; i++) {
            swap(arrayStraight, i);
        }
        System.out.println(Arrays.toString(arrayStraight));
    }

    private static void swap(int[] arrayStraight, int i) {
        int temp;
        temp = arrayStraight[i];
        arrayStraight[i] = arrayStraight[arrayStraight.length - 1 - i];
        arrayStraight[arrayStraight.length - 1 - i] = temp;
    }
}
