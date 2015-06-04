/**
 * Найдите сумму первых n целых чисел, которые делятся
 * на 3.
 */
public class DivisionThree {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);
    }
}