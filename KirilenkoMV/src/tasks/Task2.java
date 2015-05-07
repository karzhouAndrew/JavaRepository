package tasks;

/**
 * Created by Kirilenko_MV on 29.04.2015.
 * 2.	Даны вещественные числа a, b, c, d. Если a  b  c  d, то каждое число заменить наибольшим,  если  a > b > c > d,  то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class Task2 {
    public static void main(String[] args) {
        double a = 1231.1234;
        double b = 1231.1224;
        double c = 1231.1214;
        double d = 1231.1204;

        if (a <= b && b <= c && c <= d) {
            a = d;
            b = d;
            c = d;
        } else if (a > b && b > c && c > d) {
            //ничего не делаем
        } else {
            a = Math.pow(a, 2);
            b = Math.pow(a, 2);
            c = Math.pow(a, 2);
            d = Math.pow(a, 2);
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
