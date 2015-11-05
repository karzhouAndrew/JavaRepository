package lab15;

import java.util.*;

/**
 * Create two dimensional square array and fill it in a butterfly style.
 **/
public class Butterfly {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines and columns of the array: ");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] butterfly = new int[lines][columns];
        System.out.println("And here is a butterfly!");
        for (int i = 0; i <= butterfly.length / 2; i++) {
            for (int k = i; k < butterfly.length - i; k++) {
                butterfly[i][k] = 1;
                butterfly[butterfly.length - 1 - i][k] = 1;
            }
        }
        System.out.println(Arrays.deepToString(butterfly));
        scanner.close();
    }
}



