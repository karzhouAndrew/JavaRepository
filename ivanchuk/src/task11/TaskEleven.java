package task11;

import java.util.Scanner;

// Найдите сумму первых n целых чисел, которые делятся на 3.

public class TaskEleven {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int sum = 0;
        int i = 1;
        while (i < number + 1) {
            sum += i;
            i++;
        }
        sum *= 3;
        System.out.println("Cумма первых " + number + " целый чисел, которые делятся на 3: " + sum);
    }
}
