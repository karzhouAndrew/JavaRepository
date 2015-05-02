package workGroup;

/**
 * Created by User on 02.05.2015.
 * Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class HomeWorkNumber9 {
    public static void main(String[] args) {
        int max = 0;
        int x = (int) (Math.random() * 20);
        max = x;
        while (x != 0) {
            System.out.print(x + " ");
            x = (int) (Math.random() * 20);
            if (max < x) {
                max = x;
            }
        }
        System.out.println("\nМаксимум = " + max);
    }
}
