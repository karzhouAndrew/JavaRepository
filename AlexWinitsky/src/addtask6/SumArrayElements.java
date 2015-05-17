package addtask6;

/**
 * Найти сумму элементов закрашенной области массива включая диагональ
 */
public class SumArrayElements {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (10 * Math.random());
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Элементы массива");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i >= j) {
                    sum += array[i][j];
                    System.out.print(array[i][j]);
                }

            }
        }
        System.out.println();
        System.out.println("Сумма элементов массива " + sum);
    }
}