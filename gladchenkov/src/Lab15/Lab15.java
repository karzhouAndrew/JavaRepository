package Lab15;

/**
 * Создать двухмерный квадратный массив, и заполнить его «бабоч-кой», т.е таким образом:
 */
public class Lab15 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length / 2 + 1; i++) {   //заполнение
            for (int j = i; j < array.length - i; j++) {
                array[i][j] = 1;
                array[array.length - i - 1][j] = 1;
            }
        }
        for (int[] anArray : array) {   //вывод массива
            for (int j = 0; j < array.length; j++) {
                System.out.print(anArray[j]);
            }
            System.out.println();
        }
    }
}
