package lab5;

/**
 * Задание 5
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 * работает до 6 значного числа - но смысл понятен
 */
public class Lab5 {
    public static void main(String[] args) {
        int number = 11111;
        if (number % 10 == 0) {
            System.out.println(number + " рублей");
        }
        if (number % 10 == 1) {
            int num = (number - number % 10) / 10;
            if (num % 10 == 1) {
                System.out.println(number + " рублей");
            } else {
                System.out.println(number + " рубль");
            }
        }
        if (number % 10 == 2) {
            System.out.println(number + " рубля");
        }
        if (number % 10 == 3) {
            System.out.println(number + " рубля");
        }
        if (number % 10 == 4) {
            System.out.println(number + " рубля");
        }
        if (number % 10 == 5) {
            System.out.println(number + " рублей");
        }
        if (number % 10 == 6) {
            System.out.println(number + " рублей");
        }
        if (number % 10 == 7) {
            System.out.println(number + " рублей");
        }
        if (number % 10 == 8) {
            System.out.println(number + " рублей");
        }
        if (number % 10 == 9) {
            System.out.println(number + " рублей");
        }
    }
}
