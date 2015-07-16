package task35;

import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingsMessenger {

    public void greet(String language) {
        language = language.toLowerCase();
        if (language.equals("ru")) {
            Locale locale = new Locale("ru", "RU");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("task35.GreetingBundle", locale);
            System.out.println(resourceBundle.getString("greeting"));
        }
        if (language.equals("be")) {
            Locale locale = new Locale("be", "BY");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("task35.GreetingBundle", locale);
            System.out.println(resourceBundle.getString("greeting"));
        }
        if (language.equals("en")) {
            Locale locale = new Locale("en", "EN");
            ResourceBundle resourceBundle = ResourceBundle.getBundle("task35.GreetingBundle", locale);
            System.out.println(resourceBundle.getString("greeting"));
        }
    }

    public void greet() {
        Locale locale = new Locale("en", "EN");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("task35.GreetingBundle", locale);
        System.out.println(resourceBundle.getString("greeting"));
    }
}
