package task10;

import java.util.Scanner;

// Имеется целое число, определить является ли это число простым.

public class TaskTen {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int n = 2;
        boolean composite = false;
        if (number == 2) {
        } else {
            while (n <= (int) (Math.sqrt(number) + 1)) {
                if (number % n == 0) {
                    composite = true;
                    break;
                }
                n++;
            }
        }
        if (composite) {
            System.out.println(number + " составное число.");
        } else {
            System.out.println(number + " простое число.");
        }
    }
}
