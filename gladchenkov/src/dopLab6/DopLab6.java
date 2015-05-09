package dopLab6;
/**
 * Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число
 */

import static java.lang.Math.*;

public class DopLab6 {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            float numerator1 = (float) pow((pow(cos(E), x)) + pow(E, pow(x, 2)) + sqrt(1 / x), 1.0 / 3.0);
            float denominator1 = (float) pow(cos(PI * pow(x, 2)) + log10(pow(1 + x, 2)), sin(x));
            if (denominator1 == 0) {
                System.out.println("При x = " + x + " Знаминатель = 0 Делить на ноль нельзя");
                continue;
            }
            float y = numerator1 / denominator1;
            System.out.println("y = " + y);
        }
    }
}
