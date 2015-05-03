package laba10;

//There is natural number. Is it "prime number"?

import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(999) + 2;
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (i != 2 && i % 2 == 0) {
                continue;
            }
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Число " + number + " простое.");
        } else {
            System.out.println("Число " + number + " не простое.");
        }
    }
}
