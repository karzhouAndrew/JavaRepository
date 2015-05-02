package laba8;

//Find factorial natural number.
public class FactorialNumber {
    public static void main(String[] args) {
        int factorial = 1;
        int randomValue = (int) (Math.random() * 10);
        System.out.print("Факториал " + randomValue);
        while (randomValue > 1) {
            factorial *= randomValue;
            randomValue--;
        }
        System.out.println(" равен " + factorial);
    }
}
