package lab1jd2;


import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    private Locale locale;

    public Formatter() {
        locale = Locale.getDefault();
    }

    public Formatter(Locale locale) {
        this.locale = locale;
    }

    public Formatter(String language, String region) {
        locale = new Locale(language, region);
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String formatMoney(double money) {
        return NumberFormat.getCurrencyInstance(locale).format(money);
    }
}
