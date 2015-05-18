package lab11;

/* Задание 11. Найдите сумму первых n целых чисел, которые делятся на 3. */
public class Task11 {
    public static void main(String[] args) {
        int numberOfElements = 11;
        int currentNumber = 1;
        int sum = 0;
        for (int i = 1; i <= numberOfElements; i++) {
            while (currentNumber % 3 != 0) {
                currentNumber++;
            }
            sum += currentNumber;
            currentNumber++;
        }
        System.out.println("Сумма первых " + numberOfElements + " чисел, которые делятся на 3: Sum= " + sum);
    }
}