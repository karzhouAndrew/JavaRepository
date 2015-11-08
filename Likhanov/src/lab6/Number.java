package lab6;

import java.util.Scanner;

// Determine the number obtained by writing the digits in a reverse order of any natural number n

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int finalNum;
        while (number > 0) {
            finalNum = number % 10;
            number = number / 10;
            if (finalNum > 0) {
                System.out.print(finalNum);
            } else {
                System.out.print("");
            }
        }

    }
}
