package task5;

import java.util.Scanner;

//  Имеется целое число (любое), это число — сумма денег в рублях.
//  Вывести это число, добавив к нему слово «рублей» в правильном падеже.

public class TaskFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        int remainderDec = number % 10;
        int remainderCent = number % 100;
        boolean firstCheck = remainderDec == 1 && remainderCent != 11;
        boolean secondCheck = (remainderDec == 2 || remainderDec == 3 || remainderDec == 4) && (remainderCent != 12 && remainderCent != 13 && remainderCent != 14);
        if (firstCheck) {
            System.out.println(number + " рубль.");
        } else if (secondCheck) {
            System.out.println(number + " рубля.");
        } else {
            System.out.println(number + " рублей.");
        }
    }
}