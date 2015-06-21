package jd2;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by asus on 09.06.2015.
 * Написать код выводящий число 153,5 в денежном виде для Украины.
 */
public class Task1 {
    public static void main(String[] args) {
        Locale locale = new Locale("uk", "UA");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(153.5));
    }
}
