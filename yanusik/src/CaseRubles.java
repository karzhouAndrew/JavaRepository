/**
 * Имеется целое число , это число — сумма денег в рублях.
 * + * Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

import java.util.Scanner;

public class CaseRubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int val = value % 100;
        if (val > 20) {
            val = val % 10;
        }
        if (val == 1) {
            System.out.println(value + " " + "рубль");
        } else {
            if (val == 2 || val == 3 || val == 4) {
                System.out.println(value + " " + "рубля");
            } else {
                System.out.printf(value + " " + "рублей");
            }
        }
        in.close();
    }
}
