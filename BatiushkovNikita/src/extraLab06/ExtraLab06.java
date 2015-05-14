package extraLab06;

// Find the value of the function

import static java.lang.Math.*;

public class ExtraLab06 {

    private final static int INT_X = 2;
    private final static int INT_T = 1;
    private final static int INT_S = 1;

    public static void main(String[] args) {
        if (INT_X == 0 || (INT_X == -1 && (INT_S == 1 || INT_S == 0))) {
            System.out.println("Division by zero.");
        } else if (INT_X <= 1) {
            System.out.println("Incorrect input. x should be > 1");
        } else {
            System.out.println("y = " + getFunction1());
            System.out.println("y = " + getFunction2());
        }
    }

    private static double getFunction1() {
        double numerator = sqrt(sqrt(cos(exp(INT_X)) + exp(pow(INT_X, 2)) + sqrt(1 / INT_X)));
        double denominator = pow((cos(PI * pow(INT_X, 3)) + pow(log(1 + INT_X), 2)), sin(INT_X));
        return numerator / denominator;
    }

    private static double getFunction2() {
        double numerator = pow(sin(pow(INT_X, INT_T)), 2);
        double denominator = sqrt(1 + pow(INT_X, INT_S));
        return numerator / denominator;
    }
}
