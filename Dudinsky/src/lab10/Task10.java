package lab10;

/* Задание 10. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя. */
public class Task10 {
    public static void main(String[] args) {
        int number = 1979;
        boolean numberIsPrime = true;
        int limit = (int) Math.sqrt(number) + 1;
        int i;
        for (i = 2; i <= limit; i++) {
            if (number % i == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if (numberIsPrime) {
            System.out.println("Число " + number + " является простым");
        } else {
            System.out.println("Число " + number + " НЕ является простым - обнаружен (по крайней мере один) делитель: " + i);
        }
    }
}