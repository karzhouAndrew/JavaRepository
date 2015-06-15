/**
 * Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n
 */

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int numberValueDigit = 0;
        for (int k = 10, value1 = value; value1 > 0; k = k * 10) {
            value1 = value1 - k;
            numberValueDigit++;
        }
        int inverse = 0;
        int ost;
        for (int i = 1, k = 1; numberValueDigit != 0; numberValueDigit--, i = i * 10, k++) {
            ost = (value % (i * 10)) / i;
            value = value - ost;
            for (int chet = numberValueDigit; chet != 1; chet--) {
                ost = ost * 10;
            }
            inverse = ost + inverse;
        }
        System.out.println(inverse);
    }

}


