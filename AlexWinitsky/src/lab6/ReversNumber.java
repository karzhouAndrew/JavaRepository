package lab6;

/**
 * Задание 6
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 */
public class ReversNumber {
    public static void main(String[] args) {
        int number = 34506741;
        int reversnumber = 0;

        System.out.println("Исходное число " + number);
        while (number > 0) {
            reversnumber *= 10;
            reversnumber += number % 10;
            number = number / 10;
        }

        System.out.println("число, полученное выписыванием в обратном порядке цифр " + reversnumber);
    }
}