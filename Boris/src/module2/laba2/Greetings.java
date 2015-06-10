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

    private void setLocale(String loc) throws IllegalArgumentException {
        Enum locale;
        try {
            locale = Locales.valueOf(loc.toUpperCase());
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException() ;
        }
        if (locale.equals(Locales.US) || locale == null) {
            this.locale = new Locale("en", "US");
        } else if (locale.equals(Locales.RU)) {
            this.locale = new Locale("ru", "RU");
        } else if (locale.equals(Locales.BY)) {
            this.locale = new Locale("be", "BY");
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
