package task7;

import java.util.Scanner;

//Дано  любое натуральное  n. Верно ли, что все  цифры числа различны?
public class DefineUniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Еnter number :");
        int quantityDigits = 0;
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int auxiliaryNumber = number;
            sc.close();
            while (auxiliaryNumber >= 1) {
                auxiliaryNumber /= 10;
                quantityDigits++;
            }
            int[] digits = new int[quantityDigits];
            auxiliaryNumber = number;
            for (int i = 0; i < digits.length; i++) {
                digits[i] = (auxiliaryNumber % 10);
                auxiliaryNumber -= digits[i];
                auxiliaryNumber /= 10;
            }
            boolean uniqueFlag = false;
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == digits[j]) {
                        uniqueFlag = true;
                        j = quantityDigits;
                        i = quantityDigits;
                    }
                }
            }
            if (uniqueFlag) {
                System.out.println("Every digit of the number IS NOT different");
            } else {
                System.out.println("Every digit of the number IS  different");
            }
        } else {
            System.out.println("Incorrect number was entered");
        }
   }
}