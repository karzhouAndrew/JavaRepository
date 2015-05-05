package lab13;

import java.util.Arrays;
import java.util.Random;

/* Задание 13. Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив). */
public class Task13 {
    public static void main(String[] args) {
        int[] arrayToReverse = new int[12];
        int arrayToRevLength = arrayToReverse.length;
        Random rand = new Random();
        for (int i = 0; i < arrayToRevLength; i++) {
            arrayToReverse[i] = rand.nextInt(100);
        }
        System.out.println("Исходный массив случайных чисел:\n" + Arrays.toString(arrayToReverse));
        for (int i = 0; i < arrayToRevLength / 2; i++) {
            int tempVar = arrayToReverse[i];
            arrayToReverse[i] = arrayToReverse[arrayToRevLength - 1 - i];
            arrayToReverse[arrayToRevLength - 1 - i] = tempVar;
        }
        System.out.println("Результат переворота массива наоборот:\n" + Arrays.toString(arrayToReverse));
    }
}