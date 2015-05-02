package additionalTask5;

import java.util.Arrays;
import java.util.Scanner;

// Дана действительная матрица порядка n.
// Найти сумму элементов, расположенных ниже диагонали.

public class AdditionalTaskFive {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратной матрицы.");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 30);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма элементов, находящихся под диагональю, равна " + sum);
    }
}
