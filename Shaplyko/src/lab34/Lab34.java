package lab34;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Задание 34
 * Написать код выводящий число 153.5 в денежном виде для Украины.
 */
public class Lab34 {
    private static final String CURRENCY = "153.5";

    public static void main(String[] args) {
        Locale localeUkraine = new Locale("uk", "UA");
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(localeUkraine);
        System.out.println("Денежное представление для Украины: " + moneyFormat.format(CURRENCY));
    }
}

