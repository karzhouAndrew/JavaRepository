package lab10;

/* Задание 10. Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя. */
public class Task10 {
    public static void main(String[] args) {
        int number = 1979;
        boolean numberIsPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                numberIsPrime = false;
                System.out.println("Число " + number + " НЕ является простым - обнаружен (по крайней мере один) делитель: " + i);
                break;
            }
        }
        if (numberIsPrime) {
            System.out.println("Число " + number + " является простым");
        }
    }
}