package jd02.lab02;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров.
 * Если входные параметры отсутствуют, программа должна выдавать сообщение на английском.
 */
public class Lab02 {
    private static final Locale EN = Locale.UK;
    private static final Locale RU = new Locale("ru", "RU");
    private static final Locale BY = new Locale("by", "BY");
    private static final String BUNDLE_PATH = "jd02.lab02.MessagesBundle";

    public static void main(String[] args) {
        Locale.setDefault(EN);
        System.out.println(getGreetingMessage(BUNDLE_PATH, EN));
        System.out.println(getGreetingMessage(BUNDLE_PATH, RU));
        System.out.println(getGreetingMessage(BUNDLE_PATH, BY));
        System.out.println(getGreetingMessage(BUNDLE_PATH, Locale.CANADA));
    }

    public static String getGreetingMessage(String bundlePath, Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(bundlePath, locale);
        return resourceBundle.getString("greeting");
    }
}