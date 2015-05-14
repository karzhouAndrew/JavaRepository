package workGroup;

/**
 * Created by User on 02.05.2015.
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class HomeWorkNumber10 {
    public static void main(String[] args) {
        int number = 2342561;
        String result = "Число простое";
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                result = "Число имеет делитель " + i;
                break;
            }
        }
        System.out.println(result);
    }
}
