package lab8;

/**
 * Изменить пример с суммой чисел таким образом,
 * чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 */
public class Task {
    public static void main(String[] args) {
        int number = 7;
        int factorial = 1;
        while (number != 1) {
            factorial *= number--;
        }
        System.out.println("factorial = " + factorial);
    }
}
