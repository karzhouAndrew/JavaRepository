package lab13;

import java.util.Arrays;

/**
 * Create an array, fill it with random elements, display it, upend, and then display it again.
 **/
public class ArrayTwist {
    public static void main(String[] args) {
        int randomNumbers[] = new int[6];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(randomNumbers));
        for (int i = randomNumbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int tmp = randomNumbers[j];
                randomNumbers[j] = randomNumbers[j + 1];
                randomNumbers[j + 1] = tmp;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(randomNumbers));
    }
}
