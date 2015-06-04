package lab14;

/**
 * Определить сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */
public class ValueSumBetweenMinMaxValues {

    public static void main(String[] args) {
        int values[] = {1, 2, 4, 0, 44};
        int minIndex = 0;
        int maxIndex = 0;
        int valuesSum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
            if (values[i] > values[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("minIndex= " + minIndex + "; MaxIndex= " + maxIndex);
            for (int i = Math.min(minIndex, maxIndex) + 1; i < Math.max(minIndex, maxIndex) - 1; i++) {
                valuesSum += values[i];
            }
            System.out.println("Сумма между максимальным числом " + values[maxIndex] + " и минимальным   " +
                    values[minIndex]+ " равна " + valuesSum);
    }
}
