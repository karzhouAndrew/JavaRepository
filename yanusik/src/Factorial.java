/**
 * Изменить  пример  с  суммой  чисел  таким  образом,  чтобы
 * рассчитывалась не сумма, а произведение, т.е. факто
 * риал числа.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("enter the value ");
        int value = in.nextInt();
        long factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        in.close();
    }
}
