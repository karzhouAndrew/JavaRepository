package lab13;

// Reverse array

import java.util.Arrays;

public class Lab13 {
    public static void main(String[] args) {
        int[] array = new int[5];
        final int SIZE = array.length;
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.println(Arrays.toString(array));
        arrayReverse(array, SIZE);
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayReverse(int[] array, int SIZE) {
        for (int i = 0; i < SIZE / 2; i++) {
            int temp = array[i];
            array[i] = array[SIZE - 1 - i];
            array[SIZE - 1 - i] = temp;
        }
        return array;
    }
}
