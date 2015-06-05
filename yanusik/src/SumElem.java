/**
 * Определите    сумму    элементов    одномерного    массива,
 * расположенных между минимальным и максимальным знач
 * ениями.
 */
public class SumElem {
    public static void main(String[] args) {
        int[] array = {12, 33, 45, 2, 7, 34, 12, 6, 8, 108, 24, 32};
        int maxArray = array[0];
        int indexMax = 0;
        int minArray = array[0];
        int indexMin = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
                indexMax = i;
            }
            if (array[i] < minArray) {
                minArray = array[i];
                indexMin = i;
            }
        }
        int temp = 0;
        if (indexMin > indexMax) {
            temp = indexMax;
            indexMax = indexMin;
            indexMin = temp;
        }
        for (int i = indexMin + 1; i < indexMax; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
