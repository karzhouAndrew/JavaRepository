package AddTask2;

/**
 * 2.	Даны вещественные числа a, b, c, d. Если a <b <c <d, то каждое число заменить наибольшим,
 * если  a > b > c > d,
 * то числа оставить без изменений,  в противном случае – все числа заменить их квадратами
 */
public class ABCD {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 11;
        int d = 9;
        System.out.println("Исходые данные");
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        System.out.println("Полсе изменения");
        if ((a >= b) && (b >= c) && (c >= d)) {
            System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        } else if ((a < b) && (b < c) && (c < d)) {
            a = b = c = d;
            System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        } else {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
            System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
        }
    }

}

