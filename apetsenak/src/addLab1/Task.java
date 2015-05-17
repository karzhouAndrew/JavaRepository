package addLab1;

import java.util.Scanner;

/**
 * Определить сумму первых трех цифр дробной части
 * заданного положительного вещественного числа.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        double number = sc.nextDouble();
        System.out.println("Введите кол-во цифр после запятой, сумму которых нужно посчитать : ");
        int numOfDigits = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < numOfDigits; i++) {
            number -= (int) number;
            number *= 10;
            sum += (int) number;
        }
        System.out.println("number = " + number);
        System.out.println("sum = " + sum);
        sc.close();
    }
}
