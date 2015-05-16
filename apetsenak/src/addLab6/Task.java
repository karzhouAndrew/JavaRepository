package addLab6;

import java.util.Random;

/**
 * Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число.
 */

public class Task {
    public static void main(String[] args) {
        Random rand = new Random();
        Calculation calc = new Calculation();
        int x = rand.nextInt(9) + 1;
        int s = 3;
        int t = 4;
        System.out.println("Результат вычисления первой функции : " + calc.firstFunction(x));
        System.out.println("Результат вычисления второй функции : " + calc.secondFunction(x, t, s));
    }
}
