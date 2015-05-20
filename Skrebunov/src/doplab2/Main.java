package doplab2;

/*2.	Даны вещественные числа a, b, c, d. Если a  b  c  d, то каждое число заменить наибольшим,
если  a > b > c > d,  то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        int d = (int) (Math.random() * 10);
        System.out.println(a + " " + b + " " + c + " " + d + " ");
        int max = 0;
        int tempNumber = 0;
        if (a <= b) {
            tempNumber = b;
        } else {
            tempNumber = a;
        }
        if (tempNumber < c) {
            tempNumber = c;
        }
        if (tempNumber < d) {
            tempNumber = d;
        }
        System.out.println(tempNumber);
        if (a <= b && b <= c && c <= d) {
            a = tempNumber;
            b = tempNumber;
            c = tempNumber;
            d = tempNumber;
        } else if (a > b && b > c && c > d) {
            System.out.println(a + " " + b + " " + c + " " + d + " ");
        } else {
            int sqrtFromA = (int) Math.pow(a, 2.0);
            int sqrtFromB = (int) Math.pow(b, 2.0);
            int sqrtFromC = (int) Math.pow(c, 2.0);
            int sqrtFromD = (int) Math.pow(d, 2.0);
            System.out.println(sqrtFromA + " " + sqrtFromB + " " + sqrtFromC + " " + sqrtFromD + " ");
        }
    }
}
