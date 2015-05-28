package mathExpression;

import static java.lang.Math.*;
//Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число.
public class Expression {

    public static double longExpression(double x) {
        double expr1 = pow(cos(pow(E, x) + pow(E, pow(x, 2)) + 1 / sqrt(x)), -4);
        double expr2 = pow(cos(PI * pow(x, 3)) + log1p(pow(x, 2)), sin(x));
        return expr1 / expr2;
    }

    public static double shortExpression(double x, double t, double s) {
        return (sin(sin(pow(x, t)))) / sqrt(1 + pow(x, s));
    }
}
