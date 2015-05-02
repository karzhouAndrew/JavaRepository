package task8;

// Надо получить случайное число, и посчитать факториал числа.

public class TaskEight {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10);
        System.out.println("n = " + number);
        int value = 1;
        int i = 1;
        while (i <= number) {
            value *= i;
            i++;
        }
        System.out.println("n! = " + value);
    }
}
