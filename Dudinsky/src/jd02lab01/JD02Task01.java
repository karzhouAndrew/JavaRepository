package jd02lab01;

/*Задание 1. Написать код выводящий число 153.5 в денежном виде для Украины.*/

import java.util.Locale;

public class JD02Task01 {

    private static final double amount = 153.5;
    private static final String LANGUAGE = "uk";
    private static final String REGION = "UA";

    public static void main(String[] args) {
        Locale locale = new Locale(LANGUAGE, REGION);
        System.out.println(CurrencyFormatter.localize(locale, amount));
    }
}
