package task6;

import java.util.Scanner;

// Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.

public class TaskSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        in.close();
        int value = number;
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        System.out.println("Введенное число: " + number + ". Полученное число: " + result);
    }
}
