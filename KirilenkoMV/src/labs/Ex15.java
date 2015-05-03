package labs;

import java.util.Arrays;

/**
 * Created by Kirilenko_MV on 30.04.2015.
 * сделать из массива бабочку
 */
public class Ex15 {
    public static void main(String[] args) {
        int i = 7;
        int[][] array = new int[i][i];
        for (int j = 0; j < array.length; j++) {
            for (int k = j; k < array[0].length - j; k++) {
                array[j][k] = 1;
            }
        }

        for (int j = 0; j <= array.length / 2; j++) {
            for (int k = j; k < array[0].length - j; k++) {
                array[j][k] = 1;
            }
        }
        for (int j = (array.length) / 2; j < array.length; j++) {
            for (int k = array[0].length - 1 - j; k <= j; k++) {
                array[j][k] = 1;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.println(Arrays.toString(array[j]));
        }

    }
}
