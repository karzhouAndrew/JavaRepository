package additionalTask3;

// Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.

public class AdditionalTaskThree {
    public static void main(String[] args) {
        int numberDegree = 1;
        while (Math.pow(100, numberDegree) < Integer.MAX_VALUE) {
            numberDegree++;
        }
        System.out.println("Наибольшая степень числа 100 равна " + (numberDegree - 1));
    }
}
