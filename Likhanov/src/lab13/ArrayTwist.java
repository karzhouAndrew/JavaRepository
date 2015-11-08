package lab13;

/**
 * Create an array, fill it with random elements, display it, upend, and then display it again.
 **/
public class ArrayTwist {
    public static void main(String[] args) {
        System.out.print("Have look at the array: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 5);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Lets upend it:          ");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
    }
}
