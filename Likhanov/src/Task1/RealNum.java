package Task1;

import java.util.*;

/** Determine the sum of the first three digits of the fractional part of a given positive real number
 **/
public class RealNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.println("Enter the number, please: ");
        num = scanner.nextDouble();
        double intNum = num *1000;
        int bufferNum = (int)intNum;
        int sum = 0;
        for (int i = 3; i > 0; i--) {
            int getDigit = bufferNum % 10;
            intNum /= 10;
            bufferNum = (int)intNum;
            sum += getDigit;
        }
        System.out.println("The sum of the first three digits of the fractional part of " + num + " is " + sum + ".");
        scanner.close();
    }
}
