package lab1jd2;

import java.util.Locale;

/**
 * Написать код выводящий число 153.5 в денежном виде для Украи-ны.
 */
public class Task {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        double money = 153.5;
        System.out.println("Money(" + formatter.getLocale() + ") - " + formatter.formatMoney(money));
        formatter.setLocale(new Locale("ua", "UA"));
        System.out.println("Money(" + formatter.getLocale() + ") - " + formatter.formatMoney(money));
    }
}
