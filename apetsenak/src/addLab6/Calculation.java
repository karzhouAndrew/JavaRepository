package addLab6;

import static java.lang.Math.*;

public class Calculation {
    public double firstFunction(double x) {
        double numerator = pow(cos(pow(E, x)) + pow(E, pow(x, 2)) + sqrt(1. / x), 0.25);
        double denominator = pow(cos(PI * pow(x, 3)) + log(pow(1 + x, 2)), sin(x));
        return numerator / denominator;
    }

    public double secondFunction(double x, double t, double s) {
        return pow(sin(pow(x, t)), 2) / sqrt(1 + pow(x, s));
    }
}
