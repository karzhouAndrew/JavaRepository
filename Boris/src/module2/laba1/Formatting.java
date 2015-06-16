package module2.laba1;


import java.text.NumberFormat;
import java.util.Locale;

//Написать код выводящий число 153.5 в денежном виде для Украи-ны.
public class Formatting {
    private Locale locale;

    public Formatting(String language, String country) {
        this(new Locale(language, country));
    }

    public Formatting(Locale locale) {
        this.locale = locale;
    }

    public Formatting() {
        this(Locale.getDefault());
    }

    public String currency(double money) {
        return NumberFormat.getCurrencyInstance(locale).format(money);
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

    public static void seeLocales() {
        for (Locale local : Locale.getAvailableLocales()) {
            System.out.println(local.getDisplayCountry() + " " + local.getCountry());
        }
    }

    public void setLocale(String language, String country) {
        this.setLocale(new Locale(language, country));

    }
}
