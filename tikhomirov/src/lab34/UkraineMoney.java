package lab34;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Написать код, выводящий число 153,5 в денежном виде для Украины
 */
public class UkraineMoney {
    public static void main(String[] args) {
        Locale locale = new Locale("uk", "UA");
        NumberFormat hrivnaFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Представление числа в денежном виде Украины: " + hrivnaFormat.format(153.5055));

    }
}
