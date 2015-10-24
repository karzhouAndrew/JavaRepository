package jd02lab01;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static String localize(Locale locale, double amount) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        return currencyFormat.format(amount);
    }
}