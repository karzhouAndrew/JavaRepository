package lab13_1;

import java.util.Random;

/* Задание 13-1. Создать квадратный двумерный массив, заполнить его случайными элементами, распечатать, повернуть на 90 градусов по часовой, и снова распечатать (при переворачивании нежелательно создавать еще один массив). */
public class Task13_1 {
    public static void main(String[] args) {
        int arrayToTurnLength = 5;
        int[][] arrayToTurn = new int[arrayToTurnLength][arrayToTurnLength];
        Random rand = new Random();
        System.out.println("Исходный квадратный двумерный массив случайных чисел:");
        for (int i = 0; i < arrayToTurnLength; i++) {
            for (int j = 0; j < arrayToTurnLength; j++) {
                arrayToTurn[i][j] = rand.nextInt(10);
                System.out.print(arrayToTurn[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arrayToTurnLength / 2; i++) {
            for (int j = i; j < arrayToTurnLength - 1 - i; j++) {
                int tempVar = arrayToTurn[i][j];
                arrayToTurn[i][j] = arrayToTurn[arrayToTurnLength - 1 - j][i];
                arrayToTurn[arrayToTurnLength - 1 - j][i] = arrayToTurn[arrayToTurnLength - 1 - i][arrayToTurnLength - 1 - j];
                arrayToTurn[arrayToTurnLength - 1 - i][arrayToTurnLength - 1 - j] = arrayToTurn[j][arrayToTurnLength - 1 - i];
                arrayToTurn[j][arrayToTurnLength - 1 - i] = tempVar;
            }
        }
        System.out.println("Результат его поворота на 90 градусов по часовой стрелке: ");
        for (int i = 0; i < arrayToTurnLength; i++) {
            for (int j = 0; j < arrayToTurnLength; j++) {
                System.out.print(arrayToTurn[i][j] + " ");
            }
            System.out.println();
        }
    }
}