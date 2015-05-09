package Lab8;

/**
 * Изменить пример с суммой чисел таким образом, чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 */
public class Lab8 {
    public static void main(String[] args) {
        int sum = 0;
        int randomNumber = (int) (Math.random() * 4);
        int count = 2;
        int factorial = 1;

        while (randomNumber != 0) {
            sum += randomNumber;
            randomNumber = (int) (Math.random() * 4);
        }

        while (count <= sum) {
            factorial *= count;
            count++;
        }
        System.out.println("Факториал числа: " + sum + " = " + factorial);
    }
}
