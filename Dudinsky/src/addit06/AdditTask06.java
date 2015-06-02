package addit06;

import java.util.Scanner;

import static java.lang.Math.*;

/* Написать программу, вычисляющую значения 2-х функций для различных значений аргумента x, задавая его как целое число.*/
public class AdditTask06 {
    private static double firstFunDenominator;
    private static double secondFunDenominator;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите аргумент - целое число x: ");
        int x = scan.nextInt();
        System.out.print("Введите аргумент - целое число s: ");
        int s = scan.nextInt();
        System.out.print("Введите аргумент - целое число t: ");
        int t = scan.nextInt();
        scan.close();
        firstFunDenominator = calcFirstDenominator(x);
        if (x != 0 && firstFunDenominator != 0) {
            System.out.println("Значение первой функции y(х) = " + calcFirstFunction(x));
        } else {
            System.out.println("Значение первой функции не определено: деление на нуль");
        }
        secondFunDenominator = calcSecDenominator(x, s);
        if (secondFunDenominator != 0) {
            System.out.println("Значение второй функции y(х) = " + calcSecondFunction(x, t));
        } else {
            System.out.println("Значение второй функции не определено: деление на нуль");
        }
    }

    private static double calcFirstDenominator(int x) {
        return pow(cos(PI * pow(x, 3)) + log(pow(1 + x, 2)), sin(x));
    }

    private static double calcFirstFunction(int x) {
        return pow(cos(exp(x)) + exp(x * x) + sqrt(1 / x), 1. / 4) / firstFunDenominator;
    }

    private static double calcSecDenominator(int x, int s) {
        return sqrt(1 + pow(x, s));
    }

    private static double calcSecondFunction(int x, int t) {
        return pow(sin(pow(x, t)), 2) / secondFunDenominator;
    }
}
