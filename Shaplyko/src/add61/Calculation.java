package add61;

import static java.lang.Math.*;

public class Calculation {
    double y;
    public double function1(int a, int b, int c) {
        y = (pow(sin(pow(a, b)), 2)) / (sqrt(1 + (pow(a, c))));
        return y;
    }
    public double function2(int a) {
        y = (pow((cos(pow(E, a)) + pow(E, pow(a, 2)) + sqrt(1 / a)), 0.25)) / (pow(cos(PI * pow(a, 3)) + log10(pow(1 + a, 2)), sin(a)));
        return y;
    }
}

