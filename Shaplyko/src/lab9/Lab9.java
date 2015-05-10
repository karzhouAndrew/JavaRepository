package lab9;

/**
 * Задание 9
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Lab9 {
    public static void main(String[] args) {
        int max = 0;
        int randomNumber1 = (int) (Math.random() * 20);
        int randomNumber2 = (int) (Math.random() * 20);
        while (randomNumber1 != 0) {
            if (randomNumber1 > randomNumber2) {
                max = randomNumber1;
            }
            max = randomNumber2;
            randomNumber1 = (int) (Math.random() * 20);
            randomNumber2 = max;
        }
        System.out.println("Максимальное значение:" + max);
    }
}
