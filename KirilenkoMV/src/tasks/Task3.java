package tasks;

/**
 * Created by Kirilenko_MV on 29.04.2015.
 * 3.	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class Task3 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int power = 0;
        while (max > 99) {
            max /= 100;
            power++;
        }
        System.out.println("power = " + power);

    }
}
