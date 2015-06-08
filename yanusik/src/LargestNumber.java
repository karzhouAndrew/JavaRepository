/**
 * Как  в  примере,  имеется  последовательность  случайных
 * чисел,найти и вывести наибольшее из них.
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] array = {12, 56, 3, 8, 57, 54, 16};
        int lagest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > lagest) {
                lagest = array[i];
            }
        }
        System.out.println("наибольший элемент массива" + "=" + lagest);
    }
}