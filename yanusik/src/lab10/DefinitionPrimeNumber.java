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
        int value = in.nextInt();
        boolean flag = false;
        for (int i = 2; i < Math.sqrt(value) + 1; i++) {
            if (value % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("sostavnoe chislo");
        } else {
            System.out.println("prostoe chislo");
        }
        in.close();
    }
}


