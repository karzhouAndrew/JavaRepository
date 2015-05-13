package lab5;

/**
 * Задание 5
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово
 * «рублей» в правильном падеже.
 */
public class Lab5 {
    public static void main(String[] args) {
        int number = 9;
        int nextNum = (number - number % 10) / 10;
        if (nextNum % 10 == 1) {
            System.out.println(number + " рублей");
        } else {
            if (number % 10 == 1) {
                System.out.println(number + " рубль");
            } else {
                if (number % 10 >= 2 && number % 10 <= 4) {
                    System.out.println(number + " рубля");
                } else {
                    System.out.println(number + " рублей");
                }
            }
        }
    }
}