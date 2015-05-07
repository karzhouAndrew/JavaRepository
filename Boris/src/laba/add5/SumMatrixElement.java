package laba.add5;

import java.util.Arrays;
import java.util.Random;

//Find sum square matrix which lie under diagonal.
public class SumMatrixElement {
    public static void main(String[] args) {
        int dimension = 4;
        Random rand = new Random();
        int[][] arraySquare = new int[dimension][dimension];
        for (int i = 0; i < dimension * dimension; i++) {
            arraySquare[i / dimension][i % dimension] = rand.nextInt(10);
        }
        for (int i = 0; i < dimension; i++) {
            System.out.println(Arrays.toString(arraySquare[i]));
        }
        int sum = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += arraySquare[i][j];
            }
        }
        System.out.println("sum = [" + sum + "]");
    }
}
