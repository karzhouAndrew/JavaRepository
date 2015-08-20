package lab35;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Master on 10.06.2015.
 */
public class Greeting {


    public Greeting() {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("lab35.MessagesBundle_en_US", locale);
        String greeting = resourceBundle.getString("greeting");
        System.out.println(greeting);
    }

    public Greeting(String language) {
        if (language.compareTo("en") == 0) {
            Locale locale = new Locale("en", "US");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("lab35.MessagesBundle_en_US", locale);
            String greeting = resourceBundle.getString("greeting");
            System.out.println(greeting);
        }

        if (language.compareTo("ru") == 0) {
            Locale locale = new Locale("ru", "RU");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("lab35.MessagesBundle_ru_RU", locale);
            String greeting = resourceBundle.getString("greeting");
            System.out.println(greeting);
        }
        if (language.compareTo("by") == 0) {
            Locale locale = new Locale("by", "By");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("lab35.MessagesBundle_by_BY", locale);
            String greeting = resourceBundle.getString("greeting");
            System.out.println(greeting);
        }
    }
}
