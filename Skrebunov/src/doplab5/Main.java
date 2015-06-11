package doplab5;

import java.util.Random;

/*5.	Дана действительная матрица порядка n. Найти сум¬му элементов, расположенных в закрашенной части матрицы на рисунке
 */
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int mass[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rand.nextInt(10);
                if (j <= i) {
                    sum += mass[i][j];
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
