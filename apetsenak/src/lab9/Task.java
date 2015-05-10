package lab9;

/**
 * Как в примере, имеется последовательность случайных чисел,
 * найти и вывести наибольшее из них.
 */
public class Task {
    public static void main(String[] args) {
        int maxNumber = 0;
        int number = (int) (Math.random() * 20);
        while (number != 0) {
            System.out.print(number + " ");
            if (number > maxNumber) {
                maxNumber = number;
            }
            number = (int) (Math.random() * 20);
        }
        System.out.println("\nМаксимальное число - " + maxNumber);
    }
}
