package tasks;

/**
 * Created by Kirilenko_MV on 29.04.2015.
 * 1.	Определить сумму n первых цифр дробной части заданного положительного вещественного числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        double number = 1234.5674564573;
        int result = 0;
        number = number - (int) number;
        for (int i = 0; i < n; i++) {
            number *= 10;
            result += number % 10;
            int digit = (int) (number % 10);
            System.out.print(" + " + digit);
        }
        System.out.println(" = " + result);
    }
}
