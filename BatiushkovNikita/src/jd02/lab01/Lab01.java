package jd02.lab01;

// Написать код выводящий число 153.5 в денежном виде для Украины.

import java.text.NumberFormat;
import java.util.Locale;

public class Lab01 {
    private static final String VALUE = "153.5";

    public static void main(String[] args) {
        System.out.println(convertMoneyUtil(new Locale("uk", "UA"), VALUE));
    }

    public static String convertMoneyUtil(Locale locale, String value) {
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(locale);
        return moneyFormat.format(Double.parseDouble(value));
    }
}
