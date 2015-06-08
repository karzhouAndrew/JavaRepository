/**
 * Имеется целое число (любое), это число — сумма денег в рублях.
 * Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

import java.util.Scanner;

public class CaseRubls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int val = value % 100;
        switch (val) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                System.out.printf(value + " " + "рублей");
                break;
            case 1:
                System.out.printf(value + " " + "рубль");
                break;

            case 2:
            case 3:
            case 4:
                System.out.printf(value + " " + "рубля");
                break;
        }
    }
}
