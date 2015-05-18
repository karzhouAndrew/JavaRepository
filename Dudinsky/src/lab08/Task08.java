package lab08;

import java.util.Random;

/* Задание 8. Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа. */
public class Task08 {
    public static void main(String[] args) {
        double factorial = 1;
        Random rand = new Random();
        int inputNumber = rand.nextInt(100);
        System.out.print("Факториал числа " + inputNumber);
        while (inputNumber != 0) {
            factorial *= inputNumber;
            inputNumber--;
        }
        System.out.println(" имеет значение = " + factorial);
    }
}