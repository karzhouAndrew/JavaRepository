package lab3;

/**
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class LastDigitIsSeven {
    public static void main(String[] args) {
        int number = 1577;
        if (number % 10 == 7) {
            System.out.println("Послденяя цифра числа number является семёркой");
        } else {
            System.out.println("Послденяя цифра числа number не является семёркой");
        }
    }
}
