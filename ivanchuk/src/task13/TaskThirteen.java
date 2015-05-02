package task13;

import java.util.Arrays;
import java.util.Scanner;

// Создать массив, заполнить его случайными элементами, распечатать,
// перевернуть, и снова распечатать (при переворачивании
// нежелательно создавать еще один массив).

public class TaskThirteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int size = in.nextInt();
        in.close();
        int[][] array = new int[size][size];
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 50 + 1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Полученный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length - 1 - i; j++) {
                int tempOne = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = array[i][j];
                int tempTwo = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = tempOne;
                tempOne = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = tempTwo;
                array[i][j] = tempOne;
            }
        }
        for (int[] numbers : array) {
            System.out.println(Arrays.toString(numbers));
        }
    }
}
