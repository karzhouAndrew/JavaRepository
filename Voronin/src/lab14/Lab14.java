package lab14;

//Сумма элементов между минимальным и максимальным
public class Lab14 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int maxIndex = 0;
        int max = array[0];
        for (i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        int minIndex = 0;
        int min = array[0];
        for (i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        int sum = 0;
        if (minIndex < maxIndex) {
            for (i = minIndex + 1; i < maxIndex; i++) {
                sum += array[i];
            }
        } else for (i = maxIndex + 1; i < minIndex; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов между минимальным и максимальным " + sum);
    }
}
