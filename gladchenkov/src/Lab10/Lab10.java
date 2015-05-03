package Lab10;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        int Number = 2;

        for (int i = 2; i <= (int) Math.sqrt(Number) + 1; i++) {
            if (Number <= 1) {
                System.out.println("Заданное число составное");
                break;
            }
            if (Number % i == 0) {
                System.out.println("Заданное число составное");
                break;
            } else {
                System.out.println("Заданное число простое");
                break;
            }
        }
    }
}
