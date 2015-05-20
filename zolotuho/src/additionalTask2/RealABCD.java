package additionalTask2;

import java.util.Scanner;

public class RealABCD {
    public double enterReal(boolean bool, double number) {
        if (bool) {
            return number;
        } else {
            return 0;
        }
    }

    public void myException() {
        System.err.println("Exception is occurred!! Incorrect number was possible entered");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RealABCD realNumber = new RealABCD();

        try {

            System.out.print("Enter real a = ");
            double a = realNumber.enterReal(sc.hasNextDouble(), sc.nextDouble());
            System.out.print("Enter real b = ");
            double b = realNumber.enterReal(sc.hasNextDouble(), sc.nextDouble());
            System.out.print("Enter real c = ");
            double c = realNumber.enterReal(sc.hasNextDouble(), sc.nextDouble());
            System.out.print("Enter real d = ");
            double d = realNumber.enterReal(sc.hasNextDouble(), sc.nextDouble());
            sc.close();

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
        } catch (Exception e) {
            realNumber.myException();
        }
    }
}
