package additionalTask3;

//	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
public class MaxPowerOfHundredInt {
    public static void main(String[] args) {
        int number = 100;
        long currentNumber = 100;
        int counter = 1;
        System.out.println("Maximal value of integer = " + Integer.MAX_VALUE);
        while (currentNumber <= Integer.MAX_VALUE / number) {
            currentNumber *= number;
            counter++;
        }
        System.out.println("Max power of 100 = " + counter);
    }
}
