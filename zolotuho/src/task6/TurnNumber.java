package task6;

import java.util.Scanner;

//Определить число, полученное выписыванием в обратном порядке цифр любого натурального числа n.
public class TurnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Еnter number :");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        } else {
            System.out.println("Incorrect number was entered");
        }
        sc.close();
         int auxiliaryNumber = number;
        while (auxiliaryNumber >= 1) {
            int digit = (auxiliaryNumber % 10);
            auxiliaryNumber = auxiliaryNumber - digit;
            System.out.print(digit);
            auxiliaryNumber /= 10;
        }
    }
}
