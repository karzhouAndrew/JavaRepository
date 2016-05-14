package lab7;

import java.util.Scanner;

/**
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа раз-личны?
 */
public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int givenNum = scanner.nextInt();
        int digit = 0;
        int newDigit = 0;
        outer:
        while (givenNum > 9) {
            digit = givenNum % 10;
            givenNum /= 10;
            int newGivenNum = givenNum;
            while (newGivenNum > 0) {
                newDigit = newGivenNum % 10;
                if (newDigit == digit) {

                    break outer;
                }
                newGivenNum /= 10;
            }
        }
        System.out.println(newDigit + " " + digit);
        if (newDigit == digit) {
            System.out.println("Not all the digits are different");
        } else {
            System.out.println("All the digits are different");
        }
    }
}
