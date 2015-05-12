package lab13;

// Reverse array

import java.util.Arrays;

public class Lab13 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] array = new int[SIZE];;
        final int SIZE = 5;
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.println(Arrays.toString(array));
        arrayReverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayReverse(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        return array;
    }
}
