package jd2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by asus on 09.06.2015.
 * Создать программу, которая может приветствовать пользователя на трех языках: англ., рус., бел..
 * Требуемый язык должен сообщаться программе в качестве входных параметров. Если входные параметры отсутствуют,
 * программа должна выдавать сообщение на английском.
 */
public class Task2 {
    public static void main(String[] args) {
        //Example for args :
        //  be BY
        // en US;
        // ru RU
        if (args.length > 2) {
            System.out.println("Введены неверные параметры");
            System.exit(0);
        }
        Locale locale;
        if (args.length == 0) {
            locale = Locale.getDefault();
        } else {
            locale = new Locale(args[1], args[2]);
        }

        ResourceBundle resourceBundle = ResourceBundle.getBundle("jd2.MessageBundle", locale);
        System.out.println(resourceBundle.getString("greeting"));


    }
}
