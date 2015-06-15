package laba11;

/**
 * Найдите сумму первых n целых чисел, которые делятся
 * на 3
 */
public class Div {
    public static void main(String[] args) {
        int sum = 0;
        int nNumbers = 12;
        for (int i = 0; i <= nNumbers; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

