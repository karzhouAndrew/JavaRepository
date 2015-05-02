package additionalTask3;

// Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.

public class AdditionalTaskThree {
    public static void main(String[] args) {
        int maxNumberInt = Integer.MAX_VALUE;
        int i = 1;
        while (Math.pow(100, i) < maxNumberInt) {
            i++;
        }
        System.out.println("Наибольшая степень числа 100 равна " + (i - 1));
    }
}
