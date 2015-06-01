package task10;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
public class TestSimpleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int dividersNumber = 0;
            if (number < 0) {
                System.out.println("Negative integer");
            } else {
                for (int i = 2; i <= Math.sqrt(number) + 1; i++) {
                    int currentNumber = number % i;
                    if (currentNumber == 0) {
                        dividersNumber++;
                    }
                }
                if (dividersNumber == 0) {
                    System.out.println("Simple");
                } else {
                    System.out.println("Natural");
                }
            }
        } else {
            System.out.println("Incorrect enter");
        }
        sc.close();
    }
}
