package laba15;

import java.util.Arrays;

//Create square matrix and fill it "butterfly".
public class ButterflyMatrix {
    public static void main(String[] args) {
        int arraySize = 7;
        int[][] arrayButterfly = new int[arraySize][arraySize];
        for (int i = 0; i < arrayButterfly.length / 2.0; i++) {
            for (int j = i; j < arrayButterfly[i].length - i; j++) {
                arrayButterfly[i][j] = 1;
                arrayButterfly[arrayButterfly.length - i - 1][j] = 1;
            }
        }
        for (int i = 0; i < arrayButterfly.length; i++) {
            System.out.println(Arrays.toString(arrayButterfly[i]));
        }
    }
}