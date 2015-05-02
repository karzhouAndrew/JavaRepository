package task6;

import java.util.Scanner;

// Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        int i = 0;
        while (number / Math.pow(10, i) >= 1) {
            i++;
        }
        int value;
        int result = 0;
        for (int j = 0; j < i + 1; j++) {
            value = (int) (number % Math.pow(10, j + 1) / Math.pow(10, j));
            result += value * Math.pow(10, i - 1 - j);
        }
        System.out.println("Введенное число: " + number + ". Полученное число: " + result);
    }
}
