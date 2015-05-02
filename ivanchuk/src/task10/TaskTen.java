package task10;

import java.util.Scanner;

// Имеется целое число, определить является ли это число простым.

public class TaskTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число.");
        int number = in.nextInt();
        int n = 2;
        boolean composite = false;
        while (n <= (int) (Math.sqrt(number) + 1)) {
            if (number % n == 0 && n != number) {
                composite = true;
                break;
            }
            n++;
        }
        if (composite) {
            System.out.println(number + " составное число.");
        } else {
            System.out.println(number + " простое число.");
        }
    }
}
