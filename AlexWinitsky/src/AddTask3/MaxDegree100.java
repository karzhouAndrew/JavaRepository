package AddTask3;

/**
 3.	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int
 */
public class MaxDegree100 {
    public static void main(String[] args) {
        int max = 2147483647;
        int n = 0;
        long number = 100;

        while (number < max) {
            number = number * 100;
            n++;

        }
        System.out.println("Наибольшая степень числа 100, ипользуясь тип int = " + n);
    }

}