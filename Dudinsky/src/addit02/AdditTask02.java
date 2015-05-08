package addit02;

/* Даны вещественные числа a, b, c, d. Если a <= b <= c <= d, то каждое число заменить наибольшим,
   если  a > b > c > d,  то числа оставить без изменений,  в противном случае – все числа заменить их квадратами. */
public class AdditTask02 {
    public static void main(String[] args) {
        double numberA = 8.2;
        double numberB = 5.4;
        double numberC = -2.5;
        double numberD = -4.8;
        System.out.println("Заданные значения чисел: a = " + numberA + "; b = " + numberB + "; c = " + numberC + "; d = " + numberD);
        if (numberA <= numberB && numberB <= numberC && numberC <= numberD) {
            numberA = numberB = numberC = numberD;
        } else if (!(numberA > numberB && numberB > numberC && numberC > numberD)) {
            numberA *= numberA;
            numberB *= numberB;
            numberC *= numberC;
            numberD *= numberD;
        }
        System.out.println("Результаты: a = " + numberA + "; b = " + numberB + "; c = " + numberC + "; d = " + numberD);
    }
}