package lab6;

import java.util.Scanner;

// Determine the number obtained by writing the digits in a reverse order of any natural number n

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int endNumber = number % 10;
        while(number > 9){
            number/= 10;
            endNumber = (endNumber * 10) + (number % 10);
        }
        System.out.println("The reverse order number is: " + endNumber);

    }

}

