package lab13;

//повернуть матрицу на 90 градусов по часовой стрелке
public class Lab13 {
    public static void main(String[] args) {
        int temp;
        int[][] array = new int[4][4];
        int[][] array2 = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                temp = array2[i][j];
                array2[i][j] = array2[i][array2.length - j - 1];
                array2[i][array2.length - j - 1] = temp;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}