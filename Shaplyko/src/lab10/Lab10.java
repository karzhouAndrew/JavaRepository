package lab10;

/**
 * Задание 10
 Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

 */
public class Lab10 {
    public static void main(String[] args) {
        int number = 3;
        int n = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                n += 1;
            }
        }
        if (n == 1 || n == 2) {
            System.out.println("Данное число простое: " + number);
        } else {
            System.out.println("Это не простое число: " + number);
        }
    }
}