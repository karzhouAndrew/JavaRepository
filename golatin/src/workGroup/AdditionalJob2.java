package workGroup;

/**
 * Created by User on 02.05.2015.
 * Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим,
 * если  a > b > c > d,  то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class AdditionalJob2 {
    public static void main(String[] args) {
        double a = 3, b = 2, c = 1.3, d = 0;
        if ((a <= b) && (b <= c) && (c <= d)) {
            a = b = c = d;
        } else if ((a > b) && (b > c) && (c > d)) {

        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
