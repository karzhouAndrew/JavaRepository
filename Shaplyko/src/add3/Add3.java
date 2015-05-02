package add3;

/**
 * 3.	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class Add3 {
    public static void main(String[] args) {
        int number = 100;
        int degree = 1;
        double rezult;
        while (true) {
            rezult = Math.pow(number, degree);
            if (Integer.MAX_VALUE < rezult) {
                System.out.println("Максимальная степень =  " + degree);
                break;
            }
            degree++;
        }
    }
}
