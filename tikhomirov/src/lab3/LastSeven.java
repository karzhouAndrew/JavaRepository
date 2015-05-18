package lab3;

/**
 * Создайте число. Определить, является ли его последняя цифра семеркой.
 */
public class LastSeven {
    public static void main(String[] args) {
        int number = 11;
        if (number % 10 == 7) {
            System.out.println("число " + number + " оканчивается на 7");
        } else {
            System.out.println("число " + number + " не оканчивается на 7");
        }
    }
}
