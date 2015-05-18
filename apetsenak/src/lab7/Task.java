package lab7;

import java.util.Scanner;

/**
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int number = sc.nextInt();
        boolean isDigitsDifferent = true;
        do {
            int checkDigit = number % 10;
            int tempNumber = number / 10;
            while (tempNumber > 0 && isDigitsDifferent) {
                if (tempNumber % 10 == checkDigit) {
                    isDigitsDifferent = false;
                } else {
                    tempNumber /= 10;
                }
            }
            number /= 10;
        } while (number / 10 > 0 && isDigitsDifferent);
        if (isDigitsDifferent) {
            System.out.println("Цифры различны");
        } else {
            System.out.println("Цифры не различны");
        }
        sc.close();
    }
}
