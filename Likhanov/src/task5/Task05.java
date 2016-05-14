package task5;

import java.util.Arrays;
import java.util.Scanner;

/*
Been given real n- matrix. Find sum of elements located in the shaded part of the matrix below
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of line and columns: ");
        int dimension = scanner.nextInt();
        int[][] array = new int[dimension][dimension];
        arrayFillUp(scanner, array);
        sumOfDarkElements(array);
    }

    private static void arrayFillUp(Scanner scanner, int[][] array) {
        System.out.println("Fill up the array: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = number;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static void sumOfDarkElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < i + 1; k++) {
                sum += array[i][k];
            }
        }
        System.out.println("The sum of dark elements is " + sum + ".");
    }
}
