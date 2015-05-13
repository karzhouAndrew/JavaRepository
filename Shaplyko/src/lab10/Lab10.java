package lab10;

/**
 * Задание 10
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        int number = 79;
        boolean indicator = true;
        int numberSqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= numberSqrt; i++) {
            if (number % i == 0) {
                indicator = false;
            }
        }
        if (indicator) {
            System.out.println("Данное число простое: " + number);
        } else {
            System.out.println("Это не простое число: " + number);
        }
    }
}