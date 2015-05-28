package task8;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            long factorial = 1;
            if (number != 0) {
                for (int i = 1; i <= number; i++) {
                    if (factorial >= Long.MAX_VALUE / number + 1) {
                        System.err.println("Out of Long Type boundaries occurred");
                        System.out.println("Current iteration = " + i);
                        break;
                    }
                    factorial *= i;
                }
            } else {
                factorial = 0;
            }
            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Incorrect number is entered");
        }
        sc.close();
    }
}
