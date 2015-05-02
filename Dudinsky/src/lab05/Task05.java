package lab05;

/* Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже. */
public class Task05 {
    public static void main(String[] args) {
        int rubles = 11;
        int units = rubles % 10;
        int decades = rubles % 100;
        if (units < 5 && units > 1 && (decades > 14 || decades < 12)) {
            System.out.println(rubles + " рубля");
        } else if (rubles % 10 == 1 && rubles % 100 != 11) {
            System.out.println(rubles + " рубль");
        } else {
            System.out.println(rubles + " рублей");
        }

    //проверка всех тех же вариантов, но в цикле:
/*
        for (rubles = 1; rubles < 137; rubles++) {
            units = rubles % 10;
            decades = rubles % 100;
            if (units < 5 && units > 1 && (decades > 14 || decades < 12)) {
                System.out.println(rubles + " рубля");
            } else if (rubles % 10 == 1 && rubles % 100 != 11) {
                System.out.println(rubles + " рубль");
            } else {
                System.out.println(rubles + " рублей");
            }
        }
*/

    }
}
