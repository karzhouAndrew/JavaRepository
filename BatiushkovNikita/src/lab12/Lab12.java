package lab12;

// Number acquisition evaluation

public class Lab12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int maxValue = array[0];
        int maxValueIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " value " + array[i]);
        }
        System.out.println("maxValue = " + maxValue);
        System.out.println("maxValueIndex = " + maxValueIndex);
    }
}
