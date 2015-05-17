package lab11_version2;

/* Задание 11. Найдите сумму первых n целых чисел, которые делятся на 3. */
public class Task11_version2 {
    public static void main(String[] args) {
        int summandsQuantity = 11;
        int sum = 0;
        System.out.print("Сумма первых " + summandsQuantity + " чисел, которые делятся на 3: sum = ");
        int currentNumber = 1;
        while (summandsQuantity > 0) {
            if (currentNumber % 3 == 0) {
                sum += currentNumber;
                summandsQuantity--;
            }
            currentNumber++;
        }
        System.out.println(sum);
    }
}
