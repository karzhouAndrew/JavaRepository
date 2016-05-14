package lab14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Determine the sum of array's elements between the minimum and maximum values
 **/
public class SumMMs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the numbers for array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));
        int maxValue = array[0];
        int minValue = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("The min and max values and their indexes are: " + minValue + " " + maxValue + " " + minIndex + " " + maxIndex);
        int sum = 0;
        if (maxIndex - minIndex == 1 || minIndex - maxIndex == 1) {
            sum =0;
        } else {
            if (minIndex < maxIndex) {
                for (int i = minIndex+1; i < maxIndex; i++) {
                    sum += array[i];
                }
            } else {
                for (int i = maxIndex+1; i < minIndex; i++) {
                    sum += array[i];
                }
            }
        }
        System.out.println("The sum of array's elements between the minimum and maximum values is " + sum);
    }
}




