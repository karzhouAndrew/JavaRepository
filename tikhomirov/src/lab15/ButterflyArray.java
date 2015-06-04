package lab15;

/**
 * Нарисовать массив-бабочку.
 */

public class ButterflyArray {

    public static void main(String[] args) {
        int arraySize = 7;
        int array[][] = new int[arraySize][arraySize];
        for (int i = 0; i < array.length / 2 + 1; i++) {
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = array.length - i - 1; j <= i; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

