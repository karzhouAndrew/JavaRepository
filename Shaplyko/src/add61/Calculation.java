package add61;

import static java.lang.Math.*;

public class Calculation {
    public double function1(int a, int b, int c) {
        return (pow(sin(pow(a, b)), 2)) / (sqrt(1 + (pow(a, c))));
            }
    public double function2(int a) {
        double numerator = (pow((cos(pow(E, a)) + pow(E, pow(a, 2)) + sqrt(1 / a)), 0.25));
        double denominator = (pow(cos(PI * pow(a, 3)) + log10(pow(1 + a, 2)), sin(a)));
        return numerator / denominator;
    }
}

