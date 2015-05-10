package lab10;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым,
 * т.е. делится без остатка только на 1 и себя.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrimeNumber = true;
        System.out.println("Введите число : ");
        int number = sc.nextInt();
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        if (!isPrimeNumber) {
            System.out.println("Не простое");
        } else {
            System.out.println("Простое");
        }
        sc.close();
    }
}
