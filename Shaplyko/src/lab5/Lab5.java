package lab5;

/**
 * Задание 5
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 * работает до 6 значного числа - но смысл понятен
 */
public class Lab5 {
    public static void main(String[] args) {
        int number = 3;
        int num0 = number + 0;
        int num1 = number + 9;
        int num2 = number + 8;
        int num3 = number + 7;
        int num4 = number + 6;
        int num5 = number + 5;
        int num6 = number + 4;
        int num7 = number + 3;
        int num8 = number + 2;
        if (num0 % 2 == 0 && num0 % 5 == 0) {
            System.out.println(number + " рублей");
        }
        if (num1 % 2 == 0 && num1 % 5 == 0) {
            int num9 = (number - number % 10) / 10;
            num9 = num9 + 9;
            if (num9 % 2 == 0 && num9 % 5 == 0) {
                System.out.println(number + " рублей");
            } else {
                System.out.println(number + " рубль");
            }
        }
        if (num2 % 2 == 0 && num2 % 5 == 0) {
            System.out.println(number + " рубля");
        }
        if (num3 % 2 == 0 && num3 % 5 == 0) {
            System.out.println(number + " рубля");
        }
        if (num4 % 2 == 0 && num4 % 5 == 0) {
            System.out.println(number + " рубля");
        }
        if (num5 % 2 == 0 && num5 % 5 == 0) {
            System.out.println(number + " рублей");
        }
        if (num6 % 2 == 0 && num6 % 5 == 0) {
            System.out.println(number + " рублей");
        }
        if (num7 % 2 == 0 && num7 % 5 == 0) {
            System.out.println(number + " рублей");
        }
        if (num8 % 2 == 0 && num8 % 5 == 0) {
            System.out.println(number + " рублей");
        }
    }
}
