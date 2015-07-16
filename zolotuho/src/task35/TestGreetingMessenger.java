package task35;
//Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
// Требуемый язык и страна должны  сообщаться  программе  в  качестве  входных  параметров.
// Если входные параметры отсутствуют, программа должна выдавать сообщение на английском

import java.util.Scanner;

public class TestGreetingMessenger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String language = null;
        System.out.println("Enter greetings language");
        System.out.println("en - english ");
        System.out.println("ru - russian ");
        System.out.println("be - belorussian ");
        if (input.hasNextLine()) {
            language = input.nextLine();
        }
        GreetingsMessenger messenger = new GreetingsMessenger();
        if (language.isEmpty()) {
            messenger.greet();
        } else {
            messenger.greet(language);
        }
    }
}
