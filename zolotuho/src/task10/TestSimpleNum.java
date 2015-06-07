package task10;

import java.util.Scanner;

//Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
public class TestSimpleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        sc.close();
        int dividersNumber = 0;
        if (number < 0) {
            System.out.println("Negative integer");
        } else {
            for (int i = 2; i <= Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    dividersNumber++;
                    break;
                }
            }
            if (dividersNumber == 0) {
                System.out.println("Simple");
            } else {
                System.out.println("Natural");
            }
        }
    }
}
