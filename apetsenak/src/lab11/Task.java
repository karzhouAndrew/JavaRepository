package lab11;

import java.util.Scanner;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        System.out.println("Введите кол-во первых чисел : ");
        int amountOfNumbers = sc.nextInt();
        sc.close();
        while (amountOfNumbers != 0) {
            if (number % 3 == 0) {
                amountOfNumbers--;
                sum += number;
            }
            number++;
        }
        System.out.println("sum = " + sum);
    }
}
