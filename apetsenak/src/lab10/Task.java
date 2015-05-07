package lab10;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым,
 * т.е. делится без остатка только на 1 и себя.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int flag = 0;
        System.out.println("Введите число : ");
        number = sc.nextInt();
        if (number < 2) {
            flag = 1;
        }
        for (int i = 2; i < Math.sqrt(number); i++)
            if (number % i == 0) {
                flag = 1;
            }
        if (flag == 1) {
            System.out.println("Не простое");
        } else {
            System.out.println("Простое");
        }
    }
}
