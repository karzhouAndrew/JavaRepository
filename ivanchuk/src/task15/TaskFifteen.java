package task15;

import java.util.Arrays;
import java.util.Scanner;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой».

public class TaskFifteen {
    public static void main(String[] args) {
        System.out.println("Введите размер массива.");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = array[i].length - i - 1; j < i + 1; j++) {
                    array[i][j] = 1;
                }
            }
        }
        for (int[] numbers : array) {
            System.out.println(Arrays.toString(numbers));
        }
    }
}
