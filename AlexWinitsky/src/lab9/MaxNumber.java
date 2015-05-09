package lab9;

/**
 * Задание 9
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class MaxNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10);
        int max = 1;
        System.out.println("Сдучайная последовательность чисел");
        while (number != 0) {
            number = (int) (Math.random() * 10);
            System.out.print(number);
            if (number > max) {
                max = number;
            }
        }
        System.out.println();
        System.out.println("Максимальное число последовательности " + max);
    }
}
