package lab6;

/**
 * Задание 6
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
 * работает с числом знаков до 6, но можно и больше. Смысл ясен
 */
public class Lab6 {
    public static void main(String[] args) {
        int number = 12345;
        do {
            int numberDigit = number % 10;
            number = (number - number % 10) / 10;
            System.out.print(numberDigit);
        } while (number > 0);
    }
}
