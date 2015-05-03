package Lab11;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Lab11 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        int sum = 0;
        for (int i = 1; k <= n; i++) {
            if (i % 3 == 0) {
                System.out.println("\n" + "целое число " + k + " : " + i);
                k++;
                sum += i;
            }
        }
        System.out.println("сумма первых " + n + " чисел равна " + sum);
    }
}
