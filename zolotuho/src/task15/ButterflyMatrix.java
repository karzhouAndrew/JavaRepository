package task15;

import java.util.Arrays;
import java.util.Scanner;

public class ButterflyMatrix {
    public static void main(String[] args) {
        System.out.print("enter odd dimension : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            int matrixSize = sc.nextInt();
            sc.close();
            int[][] matrix = new int[matrixSize][matrixSize];
            for (int i = 0; i < matrix.length / 2 + 1; i++) {
                for (int j = i; j < matrix.length - i; j++) {
                    matrix[i][j] = 1;
                    matrix[matrix.length - i - 1][j] = 1;
                }
            }
            for (int[] ints : matrix) {
                System.out.println(Arrays.toString(ints));
            }
        } else {
            System.out.println("Incorrect number is entered");
        }
    }
}
