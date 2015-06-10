package lab35;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Создать программу, которая будет приветствовать пользователя на трех языках: английском, русском,белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров. Если входные параметры
 * отсутствуют, программа должна выдавать сообщение на английском.
 */
public class GreetingTest {
    public static void main(String[] args) {
        Locale locale;
        System.out.println("Enter interface language:");
        System.out.println("1 - English");
        System.out.println("2 - Russian");
        System.out.println("3 - Belorussian");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            locale = new Locale("en", "EN");
        } else if (i == 2) {
            locale = new Locale("ru", "RU");
        } else if (i == 3) {
            locale = new Locale("be", "BY");
        } else {
            locale = new Locale("en", "EN");
        }
        ResourceBundle rb = ResourceBundle.getBundle("lab35.MessagesBundle", locale);
        System.out.println(rb.getString("greetings"));
    }
}

