package lab10;

/**
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class Lab10 {
    public static void main(String[] args) {
        int number = 22;
        int random = (int) Math.sqrt(number);

        for (int i = 2; i <= random; i++) {
            if (number <= 1) {
                System.out.println("Заданное число составное");
                break;
            }
            if (number % i == 0) {
                System.out.println("Заданное число составное");
                break;
            } else {
                System.out.println("Заданное число простое");
                break;
            }
        }
    }
}
