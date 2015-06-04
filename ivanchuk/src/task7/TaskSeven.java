package task7;

import java.util.Scanner;

// Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?

public class TaskSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        in.close();
        int i = 0;
        while (number / Math.pow(10, i) >= 1) {
            i++;
        }
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (number % Math.pow(10, j + 1) / Math.pow(10, j));
        }
        boolean variousNumbers = true;
        for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                if (array[j] == array[k]) {
                    variousNumbers = false;
                    System.out.println("Цифры числа совпадают.");
                    break;
                }
            }
            if (!variousNumbers) {
                break;
            }
        }
        if (variousNumbers) {
            System.out.println("Все цифры числа различны.");
        }
    }
}
