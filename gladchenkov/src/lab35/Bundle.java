package lab35;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundle {

    public static void formGreetings (String language, String country) {
        Locale loc = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", loc);
        System.out.println(resourceBundle.getString("greetings"));
    }

    public static void formGreetings () {
        Locale loc = new Locale("en", "EN");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesBundle", loc);
        System.out.println(resourceBundle.getString("greetings"));
    }
}
