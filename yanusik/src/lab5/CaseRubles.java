package lab5;


/**
 * Имеется целое число ,это число — сумма денег в рублях.Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */

import java.util.Scanner;

public class CaseRubles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int val = number % 100;
        if (val > 20) {
            val = val % 10;
        }
        if (val == 1) {
            System.out.println(number + " " + "рубль");
        } else if (val == 2 || val == 3 || val == 4) {
            System.out.println(number + " " + "рубля");
        } else {
            System.out.printf(number + " " + "рублей");
        }
    }
}

