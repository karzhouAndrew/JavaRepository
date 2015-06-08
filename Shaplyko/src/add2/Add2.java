package add2;

/**
 * 2.	Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим,  если  a > b > c > d,
 * то числа оставить без изменений,  в противном случае – все числа заменить их квадратами.
 */
public class Add2 {
    public static void main(String[] args) {
        int numberA = 2;
        int numberB = 4;
        int numberC = 4;
        int numberD = 7;
        if (numberA <= numberB && numberB <= numberC && numberC <= numberD) {
            numberA = numberD;
            numberB = numberD;
            numberC = numberD;
        } else if (!(numberA > numberB && numberB > numberC && numberC > numberD)) {
            numberA = (int) Math.pow(numberA, 2);
            numberB = (int) Math.pow(numberB, 2);
            numberC = (int) Math.pow(numberC, 2);
            numberD = (int) Math.pow(numberD, 2);
        }
        System.out.println("Число a = " + numberA + " Число b = " + numberB + " Число c = " + numberC +
                " Число d = " + numberD);
    }
}

