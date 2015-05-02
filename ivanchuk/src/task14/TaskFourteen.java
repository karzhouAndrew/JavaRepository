package task14;

import java.util.Scanner;

// Определите сумму элементов одномерного массива, расположенных
// между минимальным и максимальным значениями.

public class TaskFourteen {
    public static void main(String[] args) {
        System.out.println("Введите размер массива.");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 + 1);
            System.out.print(array[i] + ";");
        }
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            } else if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        if (indexMax - indexMin < 0) {
            int temp = indexMax;
            indexMax = indexMin;
            indexMin = temp;
        }
        int sum = 0;
        for (int i = indexMin + 1; i < indexMax; i++) {
            sum += array[i];
        }
        System.out.println("\n" + "Сумма равна " + sum);
    }
}
