package lab6;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123005;
        int newNumber = 0;
        int length = String.valueOf(number).length();
        while (number > 9) {
            int b = number % 10;
            number /= 10;
            newNumber = newNumber + (int) ( b * Math.pow(10, length - 1));
            length--;
        }
        System.out.println("Итоговое число  " + (newNumber + number));
    }
}
