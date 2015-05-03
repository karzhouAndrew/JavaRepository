package Lab10;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        int a = 41;

        for (int i = (int) Math.sqrt(a) + 1; i >= 1; i--) {
            if (a % i == 0 && i != 1) {
                System.out.println("Заданное число составное");
                break;
            }
            if (i == 1) System.out.println("Заданное число простое");
        }
    }
}
