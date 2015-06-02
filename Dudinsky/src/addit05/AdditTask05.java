package addit05;

import java.util.Arrays;
import java.util.Random;

/* Дана действительная матрица порядка n. Найти сумму элементов, расположенных в ее треугольнике от нижнего левого угла до диагонали */
public class AdditTask05 {
    public static void main(String[] args) {
        final int N_SIZE = 5;
        double[][] realMatrix = new double[N_SIZE][N_SIZE];
        double sum = 0;
        Random rand = new Random();
        System.out.println("Исходная действительная матрица (порядка n = " + N_SIZE + ") случайных чисел:");
        for (int i = 0; i < N_SIZE; i++) {
            for (int j = 0; j < N_SIZE; j++) {
                realMatrix[i][j] = rand.nextDouble() * 10;
                if (j <= i) {
                    sum += realMatrix[i][j];
                }
            }
            System.out.println(Arrays.toString(realMatrix[i]));
        }
        System.out.println("Сумма элементов, расположенных в ее треугольнике от нижнего левого угла до диагонали: " + sum);
    }
}