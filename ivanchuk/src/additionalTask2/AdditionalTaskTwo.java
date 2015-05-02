package additionalTask2;

import java.util.Arrays;
import java.util.Scanner;

// Даны вещественные числа a, b, c, d.
// Если a <= b <= c <= d, то каждое число заменить наибольшим,
// если  a > b > c > d, то числа оставить без изменений,
// в противном случае – все числа заменить их квадратами.

public class AdditionalTaskTwo {
    public static void main(String[] args) {
        System.out.println("Введите числа a, b, c, d.");
        Scanner in = new Scanner(System.in);
        double[] array = new double[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        in.close();
        int testOne = 0;
        int testTwo = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                testOne++;
            } else if (array[i] > array[i + 1]) {
                testTwo++;
            }
        }
        if (testOne == 3) {
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[array.length - 1];
            }
            System.out.println(Arrays.toString(array));
        } else if (testTwo != 3) {
            for (int i = 0; i < array.length; i++) {
                array[i] *= array[i];
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println(Arrays.toString(array));
        }
    }
}
