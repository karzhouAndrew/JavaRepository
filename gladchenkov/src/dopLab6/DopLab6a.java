package dopLab6;
/**
 * Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число
 */

import static java.lang.Math.*;

public class DopLab6a {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            int s = 3;
            int t = 3;
            float numerator = (float) pow(cos(pow(x, t)), 2);
            float denominator = (float) sqrt(1 + pow(x, s));
            if (denominator == 0) {
                System.out.println("При x = " + x + " Знаминатель = 0 Делить на ноль нельзя");
                continue;
            }
            float y = numerator / denominator;
            System.out.println("y = " + y);
        }
    }
}
