package lab9;

/**
 * Задание 9
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Lab9 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 20);
        int max = randomNumber;
        while (randomNumber != 0) {
            if (randomNumber > max) {
                max = randomNumber;
            }
            System.out.println(randomNumber);
            randomNumber = (int) (Math.random() * 20);
        }
        System.out.println("Максимальное значение:" + max);
    }
}
