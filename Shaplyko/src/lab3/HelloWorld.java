package lab3;

/**
 * Задание 3
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int number = 7;
        int num = number + 3;
        if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("Число" + number + "является числом с последней цифрой семь");
        } else {
            System.out.println("Число" + number + "не оканчивается на семь");
        }
    }
}
