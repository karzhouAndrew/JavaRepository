package lab13_1;

/**
 * Создать одномерный массив, заполнить его случайными элементами, распечатать, перевернуть, снова распечатать.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        int valueNumber = (int) (Math.random() * 10);
        int[] array = new int[valueNumber];
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + "   ");
        }
        System.out.println();
        for (int i = 0; i < (array.length) / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.print("Полученный массив: ");
        for (int i:array) {
            System.out.print(i + "   ");
        }
    }
}


