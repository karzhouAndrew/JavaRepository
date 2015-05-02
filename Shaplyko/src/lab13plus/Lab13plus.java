package lab13plus;

/**
 * Задание 13* поворот на 90 градусов массива
 */
public class Lab13plus {
    public static void main(String[] args) {
        // int array[][] = new int[3][3];
        int[][] array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                int transit = array[i][j];
                array[i][j] = array[array.length - 1 - j][i];
                array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
                array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
                array[j][array.length - 1 - i] = transit;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
