package task34;

//Написать код выводящий число 153.5 в денежном виде для Украи-ны.

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("uk", "UA");
        NumberFormat ukFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(ukFormat.format(153.5));
    }
}
