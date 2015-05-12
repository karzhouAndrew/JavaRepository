package lab15;

/**
 * Задание 15
 * Создать двухмерный квадратный массив, и заполнить его «бабоч-кой», т.е таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Lab15 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = array.length - 1; i >= array.length / 2; i--) {
            for (int j = 0; j < array.length; j++) {
                if ((j < (array.length - 1 - i)) || (j > i)) {
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }
    }
}
