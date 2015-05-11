package lab11;

/**
 * Задание 11
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class DivisionThree {

    public static void main(String[] args) {
        int sum = 0;
        int dividedByThree = 0;
        int amountOfNumbers = 3;
        int number = 1;

        while (dividedByThree < amountOfNumbers) {
            int tempNumber = number % 3;
            if (tempNumber == 0) {
                dividedByThree++;
                sum = sum + number;
            }
            number++;
        }
        System.out.println("Сумма первых " + amountOfNumbers + " чисел которые делятся на 3 = " + sum);
    }
}
