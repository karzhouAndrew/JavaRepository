package task10;

import java.util.Scanner;

// Имеется целое число, определить является ли это число простым.

public class TaskTen {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        int i = 2;
        boolean composite = false;
        while (i <= (int) (Math.sqrt(number))) {
            if (number % i == 0) {
                composite = true;
                break;
            }
            i++;
        }
        if (composite) {
            System.out.println(number + " составное число.");
        } else {
            System.out.println(number + " простое число.");
        }
    }
}
