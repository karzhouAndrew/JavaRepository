package addLab3;

/**
 * Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class Task {
    public static void main(String[] args) {
        int intMaxValue = Integer.MAX_VALUE;
        int power = 0;
        System.out.println("intMaxValue = " + intMaxValue);
        while (intMaxValue > 100) {
            intMaxValue /= 100;
            power++;
        }
        System.out.println("power = " + power);
    }
}
