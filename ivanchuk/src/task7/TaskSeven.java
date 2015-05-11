package task7;

import java.util.Scanner;

// Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?

public class TaskSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        long number = in.nextLong();
        in.close();
        int i = 0;
        while (number / Math.pow(10, i) >= 1) {
            i++;
        }
        if (i > 10) {
            System.out.println("Цифры числа совпадают.");
        } else {
            int[] array = new int[i];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (number % Math.pow(10, j + 1) / Math.pow(10, j));
            }
            boolean test = true;
            for (int j = 0; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[j] == array[k]) {
                        test = false;
                        System.out.println("Цифры числа совпадают.");
                        break;
                    }
                }
                if (!test) {
                    break;
                }
            }
            if (test) {
                System.out.println("Все цифры числа различны.");
            }
        }
    }
}
