package workGroup;

import java.util.Arrays;

/**
 * Created by User on 02.05.2015.
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).
 */
public class HomeWorkNumber13 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length >> 1; i++) {
            array[array.length - i - 1] ^= array[i];
            array[i] ^= array[array.length - i - 1];
            array[array.length - i - 1] ^= array[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
