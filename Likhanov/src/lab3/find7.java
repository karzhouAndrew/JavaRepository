package lab3;

import java.util.Scanner;

//find out if the last digit is seven
public class find7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print the number: ");
        int num = scanner.nextInt();
        if (num % 10 == 7) {
            System.out.println("The last digit is 7");
        } else {
            System.out.println("The last digit is not 7");
        }
    }
}
