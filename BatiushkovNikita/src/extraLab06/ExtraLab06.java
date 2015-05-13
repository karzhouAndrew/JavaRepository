package extraLab06;

// Find the value of the function

import static java.lang.Math.*;

public class ExtraLab06 {
    public static void main(String[] args) {
        int x = 2;
        int t = 1;
        int s = 1;

        if (x == 0 || (x == -1 && (s == 1 || s == 0))) {
            System.out.println("Division by zero.");
        } else if (x <= 1) {
            System.out.println("Incorrect input. x should be > 1");
        } else {
            System.out.println("y = " + getFunction1(x));
            System.out.println("y = " + getFunction2(x, t, s));
        }
    }

    private static double getFunction1(int x) {
        double numerator = sqrt(sqrt(cos(exp(x)) + exp(pow(x, 2)) + sqrt(1 / x)));
        double denominator = pow((cos(PI * pow(x, 3)) + pow(log(1 + x), 2)), sin(x));
        return numerator / denominator;
    }

    private static double getFunction2(int x, int t, int s) {
        double numerator = pow(sin(pow(x, t)), 2);
        double denominator = sqrt(1 + pow(x, s));
        return numerator / denominator;
    }
}

