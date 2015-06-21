package lab34;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Master on 10.06.2015.
 */
public class UkraineMoneyFormat {
    void moneyFormateUkraine() {
        Locale loc = new Locale("ua", "UA");
        NumberFormat hrivnaFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(hrivnaFormat.format(153.5));
    }
}
