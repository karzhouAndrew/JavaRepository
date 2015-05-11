package lab14;
//Определите сумму элементов одномерного массива, расположен-ных между минимальным и максимальным значениями.

/**
 * Created by USER on 11.05.2015.
 */
public class task14 {
    public static void main(String[] args) {
        int array[] = {2, 5,1, 9,5,3,8,6,3,4, 10, 7};
        int maxnamber = array[1];
        int minnamber = array[1];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxnamber] < array[i]) {
                maxnamber = i;
            } else if (array[minnamber] > array[i]) {
                minnamber = i;
            }
        }
        System.out.println(maxnamber);
        System.out.println(minnamber);
        if (minnamber > maxnamber) {
            for (int i = maxnamber+1; i < minnamber; i++) {
                sum += array[i];
            }
        } else {
            for (int i = minnamber+1; i < maxnamber; i++) {
                sum += array[i];
            }
        }
        System.out.println("сумма элементов = " + sum);
    }
}



