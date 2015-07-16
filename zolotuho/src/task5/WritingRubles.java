package task5;

import java.util.Scanner;

//Имеется целое число (любое), это число — сумма денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.
public class WritingRubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rubles do you want to enter: ");
        int rub = 0;
        if (sc.hasNext()) {
            rub = sc.nextInt();
        }
        sc.close();
        if (rub / 10 % 10 == 1 || rub % 10 > 4) {
            System.out.print("рублей");
        } else if (rub % 10 == 1) {
            System.out.print("рубль");
        } else {
            System.out.print("рубля");
        }
    }
}
