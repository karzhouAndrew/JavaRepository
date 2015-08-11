package lab10;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class simplenum {
    static int res;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int div = 2; div < number; div++) {
            res = number % div;
            if (res == 0) {
                break;
            }
        }
        if (number == 1) {
            System.out.println("1 isn't a simple number.");
        } else if (number == 2) {
            System.out.println("2 is a simple number.");
        } else if (res == 0) {
            System.out.println(number + " isn't a simple number.");
        } else {
            System.out.println(number + " is a simple number.");
        }

    }
}
