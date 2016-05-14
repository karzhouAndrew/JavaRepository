package lab11;

import java.util.Scanner;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class sum {
    static int sum = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter quantity of numbers: ");
        int lowBarrier = scanner.nextInt();
        System.out.println("Entet the numbers: ");
        for(int i = 0; i < lowBarrier; i++){
            int number = scanner.nextInt();
            if(number % 3 == 0){
                sum+= number;
            }
        }
        System.out.println("The sum of the first three numbers that can be divided by 3 is " + sum + ".");
        scanner.close();
    }
}
