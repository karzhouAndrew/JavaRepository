package jd02lab02;

import java.util.Locale;
import java.util.ResourceBundle;

public class Messenger {

    private static final String MESSAGES_BUNDLE = "jd02lab02.resources.MessagesBundle";

    public String getVisitorGreeting(Locale locale) {
        ResourceBundle resBundle = ResourceBundle.getBundle(MESSAGES_BUNDLE, locale);
        return resBundle.getString("greetings");
    }
}
