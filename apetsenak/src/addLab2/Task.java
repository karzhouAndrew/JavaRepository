package addLab2;

import java.util.Scanner;

/**
 * Даны вещественные числа a, b, c, d.
 * Если a <= b <= c <= d, то каждое число заменить наибольшим,
 * если  a > b > c > d, то числа оставить без изменений,
 * в противном случае – все числа заменить их квадратами
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а : ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Введите число b : ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Введите число c : ");
        double c = Double.parseDouble(sc.nextLine());
        System.out.println("Введите число d : ");
        double d = Double.parseDouble(sc.nextLine());
        if (a <= b && b <= c && c <= d) {
            a = b = c = d;
        } else if (!(a > b && b > c && c > d)) {
            a = Math.pow(a, 2);
            b = Math.pow(b, 2);
            c = Math.pow(c, 2);
            d = Math.pow(d, 2);
        }
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        sc.close();

    }
}
