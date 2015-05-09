package pwt.math;

import static java.lang.Math.*;

/**
 * Created by Kirilenko_MV on 06.05.2015.
 * Вычислить математические выражения.
 */
public class Task6 {
    public static void main(String[] args) {
        int x = 10;

        double y = pow(cos(pow(E, x)) + pow(E, pow(x, 2) + sqrt(1 / x)), 1.0 / 4)
                / pow(cos(PI * pow(x, 3)) + log(pow(1 + x, 2)), sin(x));

        System.out.println("y = " + y);

        double t = 1.0;
        double s = 1.0;
        y = pow(sin(pow(x, t)), 2) / sqrt(1 + pow(x, s));
        System.out.println("y = " + y);
    }
}
