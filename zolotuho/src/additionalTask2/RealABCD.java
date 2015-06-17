package additionalTask2;

import java.util.Scanner;

public class RealABCD {

    public double enterRealNumber(Scanner input, char symbol) {
        System.out.print("Enter real " + symbol + " = ");
        return input.hasNextDouble() == true ? input.nextDouble() : 0;
    }

    public static void main(String[] args) {
        RealABCD realNumber = new RealABCD();
        Scanner input = new Scanner(System.in);
        double a = realNumber.enterRealNumber(input, 'a');
        double b = realNumber.enterRealNumber(input, 'b');
        double c = realNumber.enterRealNumber(input, 'c');
        double d = realNumber.enterRealNumber(input, 'd');
        input.close();
        if ((a <= b) && (b <= c) && (c <= d)) {
            a = d;
            b = d;
            c = d;
            System.out.println();
            System.out.println(" a = " + a + " b = " + b + " c = " + c + " d = " + d);
        } else if ((a > b) && (b > c) && (c > d)) {
            System.out.println();
            System.out.println(" a = " + a + " b = " + b + " c = " + c + " d = " + d);
        } else {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
            System.out.println();
            System.out.println(" a = " + a + " b = " + b + " c = " + c + " d = " + d);
        }
    }
}
