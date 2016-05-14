package Task2;

import java.util.*;

/**
 * Given real numbers a, b, c, d. If a <= b <= c <= d, each number replace by the biggest, if a> b> c> d, the numbers remain unchanged, in other cases -  returns the value of numbers raised to the power of 2
 **/

public class FourNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number, please: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        if (a <= b && b <= c && c <= d) {
            a = b = c = d;
            System.out.println("As a <= b <= c <= d, so now numbers are: " + a + " " + b + " " + c + " " + d);
        } else if (a > b && b > c && c > d) {
            System.out.println("As a > b > c > d, so nnumbers remain the same: " + a + " " + b + " " + c + " " + d);
        } else {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
            System.out.println("The value of numbers raised to the power of 2: " + a + " " + b + " " + c + " " + d);
        }
        scan.close();
    }
}
