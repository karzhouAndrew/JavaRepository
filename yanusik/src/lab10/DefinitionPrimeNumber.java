package lab10;

/**
 * Имеется целое число, определить является ли это число
 * простым,т.е. делится без остатка только на 1 и себя.
 */


import java.util.Scanner;

public class DefinitionPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("enter value");
        int number = in.nextInt();
        in.close();
        boolean compound = false;
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                compound = true;
                break;
            }
        }
        if (compound) {
            System.out.println("sostavnoe chislo");
        } else {
            System.out.println("prostoe chislo");
        }
    }
}


