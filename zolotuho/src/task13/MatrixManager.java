package task13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Создать квадратную матрицу, заполнить ее случайными элементами, распечатать, перевернуть,
// и снова распечатать (при переворачивании нежелательно создавать еще один массив).
public class MatrixManager {
    public void swapMatrix(int[][] matriX) {
        int startLinePosition = 0;
        for (int i = startLinePosition; i < matriX.length / 2 + 1; i++) {
            int startRowPosition = startLinePosition;
            for (int j = i; j < matriX.length - 1 - i; j++) {
                int temp = matriX[i][j];
                matriX[i][j] = matriX[matriX.length - j - 1][i];
                matriX[matriX.length - j - 1][i] = matriX[matriX.length - i - 1][matriX.length - j - 1];
                matriX[matriX.length - i - 1][matriX.length - j - 1] = matriX[j][matriX.length - i - 1];
                matriX[j][matriX.length - i - 1] = temp;
                startRowPosition++;
            }
            startLinePosition++;
        }
    }

    public void fillMatrix(int[][] matriX) {
        Random rand = new Random();
        for (int i = 0; i < matriX.length; i++) {
            for (int j = 0; j < matriX.length; j++) {
                matriX[i][j] = rand.nextInt(100);
            }
        }
    }

    public void showMatrix(int[][] matriX) {
        for (int[] ints : matriX) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of the square matrix = ");
        int matrixSize = 0;
        MatrixManager matrixManager = new MatrixManager();
        if (sc.hasNext()) {
            matrixSize = sc.nextInt();
            sc.close();
        }
        int[][] matriX = new int[matrixSize][matrixSize];
        matrixManager.fillMatrix(matriX);
        matrixManager.showMatrix(matriX);

        matrixManager.swapMatrix(matriX);
        System.out.println("Rotated :");
        matrixManager.showMatrix(matriX);
    }
}
