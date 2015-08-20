package lab35;

import java.util.Scanner;

/**
 * Задание 2
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров.
 * Если входные параметры отсутствуют, программа должна выдавать сообщение на английском.
 */
public class Menu {
    public void menuLanguage() {
        System.out.println("Выберите язык приветствия");
        System.out.println("Английский введите en");
        System.out.println("Русский введите ru");
        System.out.println("Белорусский введите by");
        System.out.println("Для выхода из меню введите 0");
        System.out.println();
        System.out.println("Выберите язык приветствия");
        chooseMenu();
    }

    private void salution(Scanner scanner, String language) {
        Greeting greeting = new Greeting(language);
        System.out.println("Для выхода в главное меню нажмите 1");
    }


    private void chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        String language = scanner.next();
        language = language.toLowerCase();

        if (language.compareTo("en") == 0) {
            salution(scanner, language);
            language = scanner.next();
        } else if (language.compareTo("ru") == 0) {
            salution(scanner, language);
            language = scanner.next();
        } else if (language.compareTo("by") == 0) {
            salution(scanner, language);
            language = scanner.next();
        } else if (language.compareTo("0") == 0) {
            scanner.close();
        } else {
            System.out.println("Выбран язык по умолчанию");
            Greeting greeting = new Greeting();
            System.out.println("Для выхода в главное меню нажмите 1");
            language = scanner.next();
        }

        if (language.compareTo("1") == 0) {
            menuLanguage();
        }
    }
}
