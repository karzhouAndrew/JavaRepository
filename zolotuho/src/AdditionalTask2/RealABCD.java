package AdditionalTask2;

import java.util.Scanner;

public class RealABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        System.out.print("Enter real a = ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Enter real b = ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.print("Enter real c = ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        System.out.print("Enter real d = ");
        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
        }
        if ((a <= b) && (b <= c) && (c <= d)) {
            a = d;
            b = d;
            c = d;
            System.out.println(" a = " + a + " b = " + b + "c = " + c + " d = " + d);
        } else if ((a > b) && (b > c) && (c > d)) {
            System.out.println(" a = " + a + " b = " + b + "c = " + c + " d = " + d);
        } else {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
            System.out.println(" a = " + a + " b = " + b + "c = " + c + " d = " + d);
        }

    }

}
