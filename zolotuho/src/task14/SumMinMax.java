package task14;

import java.util.Random;
//Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
public class SumMinMax {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = 0;
        int min = array[0];
        int iterMin = 0;
        int iterMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                iterMax = i;
            }

            if (array[i] < min) {
                min = array[i];
                iterMin = i;
            }
        }
        System.out.println("max iteration number = "+iterMax);
        System.out.println("min iteration number = "+iterMin);
        int sum = 0;
        if (iterMin < iterMax) {
            for (int i = iterMin + 1; i < iterMax; i++) {
                sum += array[i];
            }
        } else {
            for (int i = iterMax + 1; i < iterMin; i++) {
                sum += array[i];
            }
        }
        System.out.println("Sum = " + sum);
    }
}


