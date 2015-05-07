package lab13_1;

import java.util.Arrays;
import java.util.Random;

/* Задание 13-1. Создать квадратный двумерный массив, заполнить его случайными элементами, распечатать, повернуть на 90 градусов по часовой, и снова распечатать (при переворачивании нежелательно создавать еще один массив). */
public class Task13_1 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[][] arrayToTurn = new int[SIZE][SIZE];
        Random rand = new Random();
        System.out.println("Исходный квадратный двумерный массив случайных чисел:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                arrayToTurn[i][j] = rand.nextInt(10);
            }
            System.out.println(Arrays.toString(arrayToTurn[i]));
        }
        for (int i = 0; i < SIZE / 2; i++) {
            for (int j = i; j < SIZE - 1 - i; j++) {
                int tempVar = arrayToTurn[i][j];
                arrayToTurn[i][j] = arrayToTurn[SIZE - 1 - j][i];
                arrayToTurn[SIZE - 1 - j][i] = arrayToTurn[SIZE - 1 - i][SIZE - 1 - j];
                arrayToTurn[SIZE - 1 - i][SIZE - 1 - j] = arrayToTurn[j][SIZE - 1 - i];
                arrayToTurn[j][SIZE - 1 - i] = tempVar;
            }
        }
        System.out.println("Результат его поворота на 90 градусов по часовой стрелке: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(Arrays.toString(arrayToTurn[i]));
        }
    }
}