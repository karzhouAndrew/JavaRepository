package Lab11;

/**
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Lab11 {
    public static void main(String[] args) {
        int maxNumber = 5;
        int count = 1;
        int sum = 0;
        for (int i = 1; count <= maxNumber; i++) {
            if (i % 3 == 0) {
                System.out.println("\n" + "целое число " + count + " : " + i);
                count++;
                sum += i;
            }
        }
        System.out.println("сумма первых " + maxNumber + " чисел равна " + sum);
    }
}
