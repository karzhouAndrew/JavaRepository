package AddTask5;

import java.util.Arrays;

/**
 * Повернуть многомерный массив на 90 градусов по часовой стрелке.
 */
public class ArrayRevers {
    public static void main(String[] args) {
        System.out.println("Исходный многомерный массив");
        int array[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                int temp = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = temp;
            }
        }

        System.out.println("Перевернутый многомерный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
