package lab35;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Задание 35
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров. Если входные параметры
 * отсутствуют, программа должна выдавать сообщение на английском.
 * В данной задаче switch мне нравится!!!!!
 */
public class Lab35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну жительства: ");
        System.out.println("Введите EXIT для выхода из программы");
        while (true) {
            switch (scanner.nextLine().toUpperCase()) {
                case "RU":
                    Locale localeRussia = new Locale("ru", "RU");
                    ResourceBundle resourceBundleRU = ResourceBundle.getBundle("MessagesBundle_ru_RU", localeRussia);
                    System.out.println(resourceBundleRU.getString("greeting"));
                    break;
                case "BY":
                    Locale localeByelorussia = new Locale("be", "BY");
                    ResourceBundle resourceBundleBY = ResourceBundle.getBundle("MessagesBundle_be_BY", localeByelorussia);
                    System.out.println(resourceBundleBY.getString("greeting"));
                    break;
                case "EXIT":
                    scanner.close();
                    break;
                default:
                    Locale localeEnglish = Locale.ENGLISH;
                    ResourceBundle resourceBundleEN = ResourceBundle.getBundle("MessagesBundle_en_UK", localeEnglish);
                    System.out.println(resourceBundleEN.getString("greeting"));
            }
        }
    }
}

