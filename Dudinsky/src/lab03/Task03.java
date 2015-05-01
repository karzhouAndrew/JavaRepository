package lab03;

/* Создайте число. Определите, является ли последняя цифра числа семеркой. */
public class Task03 {
    public static void main(String[] args) {
        int number = 327;
        if (number % 10 == 7) {
            System.out.println("Последняя цифра числа " + number + " является семеркой");
        } else {
            System.out.println("Последняя цифра числа " + number + " НЕ является семеркой");
        }
    }
}