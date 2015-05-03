package add3;

/**
 * 3.	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class Add3 {
    public static void main(String[] args) {
        int number = 100;
        int degree = 1;
        double result = 0;
        while (result < Integer.MAX_VALUE) {
            degree++;
            result = Math.pow(number, degree);
        }
        System.out.println("Максимальная степень =  " + degree);
    }
}
