package laba11;

import java.util.Random;

//Find sum first N numbers divided by 3.
public class SumSpecifiedNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int quantityNumbers = 10;
        while (quantityNumbers > 0) {
            int number = rand.nextInt(10);
            System.out.print(" " + number);
            if (number % 3 == 0) {
                System.out.println("");
                sum += number;
                quantityNumbers--;
            }
        }
        System.out.println("\n Сумма чисел, делящихся на 3 из последовательности равна " + sum);
    }
}
