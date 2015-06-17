package lab2jd2;

import java.util.Scanner;

/**
 * Создать программу, которая может приветствовать пользователя на трех языках:
 * английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров.
 * Если входные параметры отсутствуют, программа должна выдавать сообщение на английском.
 */
public class Task {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Scanner input = new Scanner(System.in);
        System.out.println(formatter.greetings());
        System.out.println("Input language (en/ru/be): ");
        String language = input.next();
        System.out.println("Input appropriate region (US/RU/BY): ");
        String region = input.next();
        input.close();
        formatter.setLocale(language, region);
        System.out.println(formatter.greetings());
    }
}
