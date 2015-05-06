package lab7;

import java.util.Scanner;

/**
 * Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int flag = 0;
        System.out.println("Введите число : ");
        number = sc.nextInt();
        for (int i = 0; i < 10 && flag < 2; i++) {
            int tempNumber = number;
            flag = 0;
            while (tempNumber != 0 && flag < 2) {
                if (tempNumber % 10 == i) {
                    flag++;
                }
                tempNumber /= 10;
            }
        }
        if (flag > 1) {
            System.out.println("Цифры не различны");
        } else {
            System.out.println("Цифры различны");
        }
    }
}
