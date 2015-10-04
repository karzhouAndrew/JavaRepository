package jd02lab02;

/*Задание 2. Создать программу, которая может приветствовать пользователя на трех языках:
английском, русском, белорусском. Требуемый язык и страна должны сообщаться программе в качестве входных параметров.
Если входные параметры отсутствуют, программа должна выдавать сообщение на английском. */

import java.util.Locale;
import java.util.Scanner;

public class JD02Task02 {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Locale locale = Locale.UK;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter digits 1...3 to choose your language:\n(1 - English\t\t2 - Русский\t\t3 - Беларуская)\nor enter any letter to exit:");
        if (scan.hasNextInt()) {
            int choice = scan.nextInt();
            if (choice == 2) {
                locale = new Locale("ru", "RU");
            } else if (choice == 3) {
                locale = new Locale("be", "BY");
            }
        }
        scan.close();
        System.out.println(messenger.getVisitorGreeting(locale));
    }
}