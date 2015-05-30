package add61;

import static java.lang.Math.*;

public class Calculation {
    public double function1(int x, int t, int s) {
        return (pow(sin(pow(x, t)), 2)) / (sqrt(1 + (pow(x, s))));
    }

    public double function2(int x) {
        double numerator = (pow((cos(pow(E, x)) + pow(E, pow(x, 2)) + sqrt(1 / x)), 0.25));
        double denominator = (pow(cos(PI * pow(x, 3)) + log10(pow(1 + x, 2)), sin(x)));
        return numerator / denominator;
    }
}

