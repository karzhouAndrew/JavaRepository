package lab6;

/**
 * Определить число, полученное выписыванием в
 * обратном порядке цифр любого натурального числа n.
 */
public class Task {
    public static void main(String[] args) {
        int number = 184749573;
        int invertNumber = 0;
        System.out.println("number = " + number);
        while (number != 0) {
            invertNumber *= 10;
            invertNumber += number % 10;
            number /= 10;
        }
        System.out.println("invertNumber = " + invertNumber);
    }
}