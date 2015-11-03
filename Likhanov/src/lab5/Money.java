package lab5;

import java.util.Scanner;

//write "rubles" in a proper form in addition to sum of money
public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum: ");
        int sum = scanner.nextInt();
        int units = sum % 10;
        int decades = sum % 100;
        if ((units >= 2 && units <= 4) && (decades < 12 || decades > 14)) {
            System.out.println(sum + " ryblia");
        } else if ((units == 1) && decades != 11) {
            System.out.println(sum + " rybl'");
        } else {
            System.out.println(sum + " ryblei");
        }
        scanner.close();
    }
}
