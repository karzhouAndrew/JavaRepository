package laba10;

//There is natural number. Is it "prime number"?

import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(999);
        boolean isPrime = true;
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Число " + number + " простое.");
            } else {
                System.out.println("Число " + number + " не простое.");
            }
        } else {
            System.out.println("Введенное число должно быть больше 2.");
        }
    }
}
