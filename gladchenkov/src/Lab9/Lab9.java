package Lab9;

/**
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Lab9 {
    public static void main(String[] args) {

        int n = 0;
        int randomNumber = (int) (Math.random() * 10);
        int max = 0;

        while (randomNumber != 0) {
            n++;
            randomNumber = (int) (Math.random() * 10);
            System.out.println("случайное число: " + randomNumber);
            if (max < randomNumber) {
                max = randomNumber;
            }
        }

        if (n != 0) {
            System.out.println("максмальное число: " + max);
        }
    }
}
