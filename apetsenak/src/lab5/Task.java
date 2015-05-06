package lab5;

/**
 * Имеется целое число (любое), это число — сумма денег в рублях.
 * Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class Task {
    public static void main(String[] args) {
        int number = 111;
        if (number % 10 == 0|| number % 10 > 4 || (number % 100 > 10 && number % 100 < 15)) {
            System.out.println(number + " рублей");
        } else if (number % 10 == 1) {
            System.out.println(number + " рубль");
        } else {
            System.out.println(number + " рубля");
        }
    }
}
