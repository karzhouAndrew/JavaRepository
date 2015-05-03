package Lab5;

/**
 * Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
 */
public class Lab5 {
    public static void main(String[] args) {
        int a = 12311;

        if (a % 10 == 0) {
            System.out.println(a + " рублей  ");
        } else if (a % 100 >= 11 && a % 100 <= 19) {
            System.out.println(a + " рублей ");
        } else if (a % 10 == 1) {
            System.out.println(a + " рубль ");
        } else if (a % 10 >= 2 && a % 10 <= 4) {
            System.out.println(a + " рубля ");
        } else {
            System.out.println(a + " рублей ");
        }
    }
}
