package laba8;

//Find factorial natural number.
public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        int factorialNumber = number;
        for (int i = number - 1; i > 1; i--) {
            factorialNumber *= i;
        }
        System.out.println("\n Факториал " + number + " равен " + factorialNumber);
    }
}
