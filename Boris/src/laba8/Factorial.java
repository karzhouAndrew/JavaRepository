package laba8;

import java.util.Random;

//Find factorial natural number.
public class Factorial {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);
        int factorialNumber = number;
        if (number != 0) {
            for (int i = number - 1; i > 1; i--) {
                factorialNumber *= i;
            }
        } else {
            factorialNumber = 1;
        }
        System.out.println("\n Факториал " + number + " равен " + factorialNumber);
    }
}