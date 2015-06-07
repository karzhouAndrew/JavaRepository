package task8;

import java.util.Scanner;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        sc.close();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            if (factorial > Long.MAX_VALUE / number) {
                System.err.println("Out of Long Type boundaries occurred");
                System.out.println("Current iteration = " + i);
                System.out.println("Current");
                break;
            }
            factorial *= i;
        }
        System.out.println("Factorial = " + factorial);
    }
}
