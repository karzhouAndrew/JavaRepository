package laba13.laba1;

import java.util.Arrays;
import java.util.Random;

//Turn square massive to 90 degree.
public class TurnSquareMassive {
    public static void main(String[] args) {
        Random rand = new Random();
        int quantityMassive = 7;
        int[][] arrayStraight = new int[quantityMassive][quantityMassive];
        for (int i = 0; i < arrayStraight.length; i++) {
            for (int j = 0; j < arrayStraight[i].length; j++) {
                arrayStraight[i][j] = rand.nextInt(101);
                //arrayStraight[i][j] = i * 10 + j;
            }
            System.out.println(Arrays.toString(arrayStraight[i]));
        }
        System.out.println();
        for (int i = 0; i < arrayStraight.length / 2.0; i++) {
            for (int j = i; j < arrayStraight[i].length - 1 - i; j++) {
                swap(arrayStraight, i, j);
            }
        }
        for (int i = 0; i < arrayStraight.length; i++) {
            System.out.println(Arrays.toString(arrayStraight[i]));
        }
    }

    private static void swap(int[][] arrayStraight, int i, int j) {
        int valueTemp = arrayStraight[i][j];
        arrayStraight[i][j] = arrayStraight[arrayStraight.length - 1 - j][i];
        arrayStraight[arrayStraight.length - 1 - j][i] =
                arrayStraight[arrayStraight.length - 1 - i][arrayStraight[i].length - 1 - j];
        arrayStraight[arrayStraight.length - 1 - i][arrayStraight[i].length - 1 - j] =
                arrayStraight[j][arrayStraight[i].length - 1 - i];
        arrayStraight[j][arrayStraight[i].length - 1 - i] = valueTemp;
    }
}
