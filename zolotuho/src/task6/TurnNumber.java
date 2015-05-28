package task6;

import java.util.Scanner;

//Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
public class TurnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Еnter number :");
        int quantityDigits = 0;
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int numberAuxiliary = number;
            while (numberAuxiliary >= 1) {
                numberAuxiliary /= 10;
                quantityDigits++;
            }
            int[] digits = new int[quantityDigits];
            numberAuxiliary = number;
            for (int i = 0; i < digits.length; i++) {
                digits[i] = (numberAuxiliary % 10);
                numberAuxiliary = numberAuxiliary - digits[i];
                numberAuxiliary /= 10;
            }
            for (int digit : digits) {
                System.out.print(digit);
            }
        } else {
            System.out.println("Incorrect number was entered");
        }
        sc.close();
    }
}
