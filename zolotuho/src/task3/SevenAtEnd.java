package task3;


import java.util.Scanner;

//Создайте число. Определите, является ли последняя цифра числа семеркой.
public class SevenAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            int lastDigit = number % 10;
            if (lastDigit == 7) {
                System.out.println("The last digit is SEVEN!!!");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("incorrect number");
        }
    }
}
