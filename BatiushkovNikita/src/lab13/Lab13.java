package lab13;

// Reverse array

public class Lab13 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        arrayShow(array);
        arrayReverse(array);
        arrayShow(array);
    }

    public static int[] arrayReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void arrayShow(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
