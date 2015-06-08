/**
 Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n
 */

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int valueDigit = 0;
        int value1 = value;
        for (int k = 10; value1 > 0; k = k * 10)//подсчеет числа цифр в числе
        {
            value1 = value1 - k;
            valueDigit++;
        }
        int inverse = 0;
        int ost;
        for (int i = 1, k = 1; valueDigit != 0; valueDigit--, i = i * 10, k++) {
            ost = (value % (i * 10)) / i;
            value = value - (ost);
            for (int chet = valueDigit; chet != 1; chet--) {
                ost = ost * 10;
            }
            inverse = ost + inverse;
        }
        System.out.println(inverse);
    }

}
