package lab35;
/**
 * Создать программу, которая может приветствовать пользователя на трех языках: английском, русском, белорусском.
 * Требуемый язык и страна должны сообщаться программе в качестве входных параметров. Если входные параметры
 * отсутствуют, программа должна выдавать сообщение на английском.
 */

public class Lab35Main {
    public static void main(String[] args) {
        Bundle.formGreetings();
        Bundle.formGreetings("ru", "RU");
        Bundle.formGreetings("be", "BE");
    }
}
