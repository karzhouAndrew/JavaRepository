package task3;

import java.util.Scanner;

//Создайте число.
//Определите, является ли последняя цифра числа семеркой.
public class TaskThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число.");
        int number = in.nextInt();
        if (number % 10 == 7) {
            System.out.println("Да, последняя цифра числа семерка.");
        } else {
            System.out.println("Нет, последняя цифра числа не семерка.");
        }
    }
}