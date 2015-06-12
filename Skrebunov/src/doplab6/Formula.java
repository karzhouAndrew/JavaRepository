package doplab6;

import static java.lang.Math.*;


public class Formula {
    public double firstFormula(int x, int n) {
        double numerator = pow(sqrt(cos(pow(E, x)) + pow(E, pow(x, 2)) + sqrt(1. / x)), 1.0 / 4);
        double denominator = pow(cos(pow(x, 3)) + (pow(x + 1, 2) * n), sin(x));
        return numerator / denominator;
    }

    public double secondFormula(int x, int t, int s) {
        double numerator = ((cos(2 * pow(x, t))) - 1) / 2;
        double denominator = sqrt((pow(x, s) + 1));
        return numerator / denominator;
    }
}
