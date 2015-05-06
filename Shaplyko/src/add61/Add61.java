package add61;

/**
 * 6.	Написать программу, вычисляющую значение функции  для различных значений аргумента x,
 * задавая его как целое число.
 */
public class Add61 {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int x = 4;
        int t = 2;
        int s = 2;
        System.out.println ("Функция первая =  " + calculation.function1(x, t, s));
        System.out.println ("Функция вторая =  " + calculation.function2(x));
    }
}
