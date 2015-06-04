package lab10;

// Имеется целое число, определить, является ли это число простым.

public class SingleNumber {
    public static void main(String[] args) {
        boolean ifSingle = true;
        int number = (int) (Math.random() * 99);
        if (number == 2) {
            ifSingle = true;
        } else {
            for (int i = 2; i < Math.sqrt(number) + 1; i++) {
                if (number % i == 0) {
                    ifSingle = false;
                    break;
                }
            }
        }
        if (ifSingle) {
            System.out.println("число " + number + "  является простым ");
        } else {
            System.out.println("число " + number + " не является простым ");
        }
    }
}