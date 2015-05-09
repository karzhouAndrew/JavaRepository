package lab11;

/**
 * Задание 11
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class DivisionThree {

    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        int n = 3;
        int i = 1;

        while (j < n) {
            int x = i % 3;
            if (x == 0) {
                j++;
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Сумма первых " + n + " чисел которые делятся на 3 = " + sum);
    }
}
