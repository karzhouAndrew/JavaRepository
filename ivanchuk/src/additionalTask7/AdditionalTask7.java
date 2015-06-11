package additionalTask7;

import static java.lang.Math.*;

public class AdditionalTask7 {
    public static double firstFunction(int numberX) {
        double numerator = pow(cos(pow(E, numberX)) + pow(E, pow(numberX, 2)) + sqrt(1 / numberX), 1. / 4);
        double denominator = pow(cos(PI * pow(numberX, 3)) + log(pow(1 + numberX, 2)), sin(numberX));
        return numerator / denominator;
    }

    public static double secondFunction(int numberX, int numberT, int numberS) {
        double numerator = pow(sin(pow(numberX, numberT)), 2);
        double denominator = sqrt(1 + pow(numberX, numberS));
        return numerator / denominator;
    }
}

