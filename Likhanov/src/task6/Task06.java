package task6;

/*
Make a program that computes the value of the function for different values of the argument x, setting it as an integer.
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        functionValue(scanner);
        functionValue2(scanner);
    }

    private static void functionValue(Scanner scanner) {
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the e: ");
        int e = scanner.nextInt();
        double number = Math.cos(Math.pow(e, x)) + Math.pow(e, Math.pow(x, 2)) + Math.sqrt(1 / x);
        double y = sqrt(number, 4) / (Math.pow(Math.cos(Math.PI * Math.pow(x, 3)) + Math.log(Math.pow(1 + x, 2)), Math.sin(x)));
        System.out.println("The result is " + y);
    }

    static double sqrt(double expression, double exponent) {
        return Math.pow(expression, 1 / exponent);
    }

    private static void functionValue2(Scanner scanner) {
        System.out.println("Enter the x: ");
        int x = scanner.nextInt();
        System.out.println("Enter the t: ");
        int t = scanner.nextInt();
        System.out.println("Enter the s: ");
        int s = scanner.nextInt();
        double y = (Math.pow(Math.sin(Math.pow(x, t)), 2)) / (Math.sqrt(1 + Math.pow(x, s)));
        System.out.println("The result is " + y);
    }
}
