package workGroup;

import java.util.Arrays;

/**
 * Created by User on 02.05.2015.
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class HomeWorkNumber12 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));
        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[max] < array[j]) {
                max = j;
            }
        }
        System.out.println("Номер максимальной оценки:" + max);
    }
}
