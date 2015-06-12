package module2.laba2;

//Создать программу, которая может приветствовать пользователя на трех языках:
// английском, русском, белорусском. Требуемый язык и страна должны сообщаться
// программе в качестве входных параметров. Если входные параметры отсутствуют,
// программа должна выдавать сообщение на английском.

import java.util.Locale;
import java.util.ResourceBundle;

public class Greetings {
    private Locale locale = Locale.getDefault();
    private static String path = "module2.MessagesBundle";

    public Greetings() {
        setLocale("US");
    }

    private void setLocale(String loc) throws IllegalArgumentException{
        loc = loc.toUpperCase();
        if (loc.equals("US") || locale == null) {
            this.locale = new Locale("en", "US");
        } else if (loc.equals("RU")) {
            this.locale = new Locale("ru", "RU");
        } else if (loc.equals("BY")) {
            this.locale = new Locale("be", "BY");
        } else {
            throw new IllegalArgumentException();
        }
    }

    private String getMessage(String key) {
        return ResourceBundle.getBundle(path, locale).getString(key);
    }

    public String getGreetings(String locale) {
        try {
            setLocale(locale);
            return getMessage("greeting");
        } catch (IllegalArgumentException e) {
            return getMessage("exception");
        }
    }

    public String getGreetings() {
        return getGreetings("US");
    }


}