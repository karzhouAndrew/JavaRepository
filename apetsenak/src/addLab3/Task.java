package addLab3;

/**
 * Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class Task {
    public static void main(String[] args) {
        int intMaxValue = Integer.MAX_VALUE;
        int power;
        System.out.println("intMaxValue = " + intMaxValue);
        for (power = 0; intMaxValue > 100; power++) {
            intMaxValue /= 100;
        }
        System.out.println("power = " + power);
    }
}
