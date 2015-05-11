package lab15;

//заполнить массив бабочкой
public class Lab15 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = i; j <= (array.length - i - 1); j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (i = array.length - 1; i >= 0; i--) {
            for (j = i; j >= (array.length - i - 1); j--) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
