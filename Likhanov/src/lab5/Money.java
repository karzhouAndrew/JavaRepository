package lab5;

import java.io.BufferedReader;
import java.util.Scanner;

//write "rubles" in a proper form in addition to sum of money
public class Money {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum of money.");
        int moneySum = scanner.nextInt();
        int units = moneySum % 10;
        int decades = moneySum % 100;
        if(units == 1 & decades != 11)
        {
            System.out.println(moneySum + " rubl'");
        } else if((units >= 2 && units <= 4) & (decades != 12 && decades != 13 && decades != 15))
        {
            System.out.println(moneySum + " rublia");
        } else
        {
            System.out.println(moneySum + " reblei");
        }
    }
}

