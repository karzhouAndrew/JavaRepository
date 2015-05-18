package lab5;

/**
 * Имеется целое число, это число-сумма денег в рублях. Вывести это число, добавив к нему слово "рублей" в
 * правильном падеже.
 */
public class MoneyName {
    public static void main(String[] args) {
        int rubli = 111;
        if (rubli % 10 == 1) {
            if (rubli % 100 == 11) {
                System.out.println("Количество денег: " + rubli + " рублей");
            } else {
                System.out.println("Количество денег: " + rubli + " рубль");
            }
        } else if (rubli % 10 > 1 && rubli % 10 < 5) {
            if (rubli % 100 >= 12 && rubli % 100 <= 14) {
                System.out.println("Количество денег: " + rubli + " рублей");
            } else {
                System.out.println("Количество денег: " + rubli + " рубля");
            }
        } else {
            System.out.println("Количество денег: " + rubli + " рублей");
        }
    }
}
