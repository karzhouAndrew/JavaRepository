package lab3;

import java.util.Arrays;

/**
 * Created by USER on 02.05.2015.
 */
//Создайте число. Определите, является ли последняя цифра числа семеркой.
public class task3 {
    public static void main(String[] args) {
        int a = 456898;
        if (a % 10 == 7) {
            System.out.println("Последнее число 7");
        } else {
            System.out.println("Последнее число не 7");
        }
    }
}