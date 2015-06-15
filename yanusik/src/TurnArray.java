/**
 * Создать   массив,   заполнить   его   случайными   элементами
 * ,
 * распечатать,  перевернуть,  и  снова  распечатать  (при
 * переворачивании
 * нежелательно создавать еще один массив).
 */

import java.util.Scanner;
import java.util.Arrays;

public class TurnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива : ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
