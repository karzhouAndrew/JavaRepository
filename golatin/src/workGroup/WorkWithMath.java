package workGroup;
import static java.lang.Math.*;

/**
 * Created by NotePad on 12.05.2015.
 */
/*6.	Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число.*/

public final class WorkWithMath {
    public static double function1(int x) {
        return exp(log(cos(exp(x)) + exp(x * x) + pow(x, -1. / 2)) / 4. - sin(x) * log(pow(-1, x) + 2 * log(1 + x)));
    }

    public static double function2(int x, int t, int s) {
        return (sin(pow(x, t)) * sin(pow(x, t))) / (sqrt(1 + pow(x, s)));
    }
}
