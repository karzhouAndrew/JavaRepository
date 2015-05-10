package lab8;

/**
 * > + * Изменить пример с суммой чисел таким образом, чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 * > +
 */
public class Lab8 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        int count = 2;
        int factorial = 1;

        while (count <= randomNumber) {
            factorial *= count;
            count++;
        }
        System.out.println("Факториал числа: " + randomNumber + " = " + factorial);
    }
}