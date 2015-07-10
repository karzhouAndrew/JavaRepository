package task34;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// написать код выводящий число 153.5 в денежном виде для Украины
public class UkrainianCurrency {
    public static void printCurrency(String currencyNumber) {
        Locale locale = new Locale("uk", "UA");
        Double doubleNum = 0D;
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        try {
            Number number = numberFormat.parse(currencyNumber);
            doubleNum = number.doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        NumberFormat grnFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(grnFormat.format(doubleNum));
    }

    public static void printCurrency(double currencyNumber) {
        Locale locale = new Locale("uk", "UA");
        NumberFormat grnFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(grnFormat.format(currencyNumber));
    }

    public static void main(String[] args) {
        UkrainianCurrency.printCurrency("153,5");
        UkrainianCurrency.printCurrency(153.5);
    }
}
