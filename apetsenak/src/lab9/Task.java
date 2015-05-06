package lab9;

/**
 * Как в примере, имеется последовательность случайных чисел,
 * найти и вывести наибольшее из них.
 */
public class Task {
    public static void main(String[] args) {
        int number;
        int maxNumber = 0;
        do {
            number = (int) (Math.random() * 20);
            System.out.print(number + " ");
            if (number > maxNumber) {
                maxNumber = number;
            }
        } while (number != 0);
        System.out.println("\nМаксимальное число - " + maxNumber);
    }
}
