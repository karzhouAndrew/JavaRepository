package AdditionalTask3;
//	Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int.
public class MaxPowerOfHundredInt {
    public static void main(String[] args) {
        int n = 100;
        long currentN = 100;
        int counter = 1;
        System.out.println(Integer.MAX_VALUE);
        while (currentN <= Integer.MAX_VALUE) {
             currentN *= n;
            counter++;
        }
        System.out.println("Max power of 100 = " + counter);
    }
}
