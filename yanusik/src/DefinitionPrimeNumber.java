/**
 * Имеется целое число, определить является ли это чис
 * ло простым,т.е. делится без остатка только на 1 и себя.
 */

import java.util.Scanner;

public class DefinitionPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("enter value");
        int value = in.nextInt();
        int flag = 0;
        for (int i = 2; i < (value - 1); i++) {
            if (value % i == 0) {
                flag++;
                break;
            }
        }
        if (flag != 0) {
            System.out.println("sostavnoe chislo");
        } else {
            System.out.println("prostoe chislo");
        }

    }
}