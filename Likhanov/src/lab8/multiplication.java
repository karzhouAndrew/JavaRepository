package lab8;

import java.util.Scanner;

/**
 * Created by NotePad.by on 11.08.2015.
 */
public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long factorial = 1;
        long factor = 2;
        while (factor <= num) {
            factorial *= factor;
            factor++;
        }
        System.out.println(factorial);
    }
}
