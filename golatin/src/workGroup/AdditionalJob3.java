package workGroup;

/**
 * Created by User on 02.05.2015.
 * Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
 */
public class AdditionalJob3 {
    public static void main(String[] args) {
        System.out.println(((int) Math.log10(Integer.MAX_VALUE)) >> 1);
    }
}
