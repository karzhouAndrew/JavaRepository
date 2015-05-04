package lab5;

/**
 * Задание 5
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class Rubl {
    public static void main(String[] args) {
        int number = 112;

        if (number % 10 == 1 && number % 100 != 11) {
            System.out.println(number + " рубль");
        } else if (number % 10 > 1 && number % 10 < 5 && (number % 100 < 10 || number % 100 > 20)) {
            System.out.println(number + " рубля");
        } else if (number % 10 >= 5 || number == 0 || number % 100 == 11 || (number % 100 <= 20 && number % 100 >= 10)) {
            System.out.println(number + " рублей");
        }
    }
}
