package lab11;

import java.util.Scanner;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class sum {
    static int sum = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lowbarrier = scanner.nextInt();
        int number = scanner.nextInt();
        for (int quantity = 1; quantity <= number; lowbarrier++) {
            if (lowbarrier == 0) {
                continue;
            }
            if (lowbarrier % 3 == 0) {
                sum += lowbarrier;
                quantity++;
            }


        }
        System.out.println("The sum of the " + number + " numbers is " + sum);
    }
}
