package lab34;

import java.text.NumberFormat;
import java.util.Locale;

public class Lab34Main {
    public static void main(String[] args) {
        Locale loc = new Locale("ua", "UA");
        NumberFormat uaFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(uaFormat.format(153.5));
    }
}
