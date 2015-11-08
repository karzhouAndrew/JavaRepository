package lab14;

/**
 * Determine the sum of array's elements between the minimum and maximum values
 **/
public class SumMMs {
    public static void main(String[] args) {
        System.out.println("We've got the array:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 4);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int minNum = array[0];
        int minIndex = 0;
        for (int j = 0; j < array.length; j++) {
            if (minNum > array[j]) {
                minNum = array[j];
                minIndex = j;
            }
        }
        int maxNum = array[0];
        int maxIndex = 0;
        for (int k = 0; k < array.length; k++) {
            if (maxNum < array[k]) {
                maxNum = array[k];
                maxIndex = k;
            }
        }
        System.out.println("The max number is " + maxNum + ", and the min number is " + minNum + ".");
        int sum = 0;
        if (maxIndex < minIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += array[i];
            }
        } else {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += array[i];

            }
        }
        System.out.println("The sum of array's elements between the minimum and maximum values is " + sum + ".");
    }
}
