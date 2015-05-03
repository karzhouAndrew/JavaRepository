package Lab9;

/**
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Lab9 {
    public static void main(String[] args) {
        double averageSum = 0;
        double sum = 1;
        int n = 0;
        int x = (int) (Math.random() * 10);
        int max = 0;

        while (x != 0) {
            n++;
            x = (int) (Math.random() * 10);
            System.out.println("случайное число: " + x);
            if (max < x) {
                max = x;
            }
        }

        if (n != 0) {
            System.out.println("максмальное число: " + max);
        }
    }
}
