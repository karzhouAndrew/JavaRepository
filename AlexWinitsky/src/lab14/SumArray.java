package lab14;

/**
 * Задание 14
 * Определите сумму элементов одномерного массива, расположен-ных между минимальным и максимальным значениями.
 */
public class SumArray {
    public static void main(String[] args) {
        int myarray[] = {2, 3, 7, 9, 10, 9, 2, 6, 5, 4};
        int max = 0;
        int min = 0;
        int idmax = 0;
        int idmin = 0;
        int sum = 0;

        for (int i = 0; i < myarray.length; i++) {
            if (max < myarray[i]) {
                max = myarray[i];
                idmax = i;
            }
            if (min > myarray[i]) {
                min = myarray[i];
                idmin = i;
            }
        }

        for (int i = (idmin + 1); i < idmax; i++) {
            sum = sum + myarray[i];
        }
        System.out.println("Сумма элемнтов массива между минимумом и максимумо = " + sum);
    }
}
