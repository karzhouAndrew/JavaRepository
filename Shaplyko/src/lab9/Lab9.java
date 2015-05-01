package lab9;

/**
 * Задание 9
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Lab9 {
    public static void main(String[] args) {
        int max = 0;
        int x = (int) (Math.random() * 20);
        int y = (int) (Math.random() * 20);
        while (x != 0) {
            if (x > y) {
                max = x;
            }
            max = y;
            x = (int) (Math.random() * 20);
            y = max;
        }
        System.out.println("Максимальное значение:" + max);
    }
}
