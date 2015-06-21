package lab2jd2;


import java.util.Locale;
import java.util.ResourceBundle;

public class Formatter {
    private Locale locale;

    public Formatter() {
        locale = Locale.US;
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

    public void setLocale(String language, String region) {
        this.setLocale(new Locale(language, region));
    }

    public String greetings() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", locale);
        return resourceBundle.getString("greetings");
    }
}
