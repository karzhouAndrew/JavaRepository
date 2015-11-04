package Task1;

import java.util.*;

/**
 * Determine the sum of the first three digits of the fractional part of a given positive real number
 **/
public class RealNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.println("Enter the number, please: ");
        num = scanner.nextDouble();
        System.out.println("Enter the quantity of digits, please: ");
        int quantDigits = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < quantDigits; i++) {
            num *= 10;
            sum += (int) num % 10;
        }
        System.out.println("The sum of the first " + quantDigits + " digits of the fractional part of " + num + " is " + sum + ".");
        scanner.close();
    }
}
