package lab12;

// Number acquisition evaluation

public class Lab12 {

    final static int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int maxValue = array[0];
        int maxValueIndex = 0;
        for (int i = 0; i < SIZE; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            System.out.println("index " + i + " value " + array[i]);
        }
        System.out.println("maxValue = " + maxValue);
        System.out.println("maxValueIndex = " + maxValueIndex);
    }
}
