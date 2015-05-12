package laba10;

//There is natural number. Is it "prime number"?

import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = 49;//rand.nextInt(999) + 2;
        boolean noMultiple = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (i != 2 && i % 2 == 0) {
                continue;
            }
            if (number % i == 0) {
                noMultiple = false;
                break;
            }
        }
        if (noMultiple) {
            System.out.println("Число " + number + " простое.");
        } else {
            System.out.println("Число " + number + " не простое.");
        }
    }
}
