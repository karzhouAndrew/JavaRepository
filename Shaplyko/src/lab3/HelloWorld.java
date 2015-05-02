package lab3;

/**
 * Задание 3
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 * можно попробовать такой алагритм
 */
public class HelloWorld {
    public static void main(String[] args) {
        int number = 15;
        if (number % 10 == 7) {
            System.out.println("Число" + number + "является числом с последней цифрой семь");
        } else {
            System.out.println("Число" + number + "не оканчивается на семь");
        }
    }
}
