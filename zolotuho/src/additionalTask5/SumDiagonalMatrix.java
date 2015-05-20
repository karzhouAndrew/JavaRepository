package additionalTask5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Дана действительная матрица порядка n. Найти сум¬му элементов, расположенных в закрашенной части матрицы на рисунке
public class SumDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of a matrix : ");
        if (sc.hasNext()) {
            int n = sc.nextInt();
            float[][] matriX = new float[n][n];
            Random rand = new Random();
            for (int i = 0; i < matriX.length; i++) {
                for (int j = 0; j < matriX.length; j++) {
                    matriX[i][j] = rand.nextFloat();
                }
            }
            for (float[] floats : matriX) {
                System.out.println(Arrays.toString(floats));
            }
            float sum = 0;
            for (int i = 0; i < matriX.length; i++) {
                for (int j = i; j < matriX.length; j++) {
                    sum += matriX[i][j];
                }
            }
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Incorrect number");
        }
        sc.close();
    }
}
