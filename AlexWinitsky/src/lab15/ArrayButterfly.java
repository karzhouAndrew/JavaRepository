package lab15;

/**
 Задание 15
 Создать двухмерный квадратный массив, и заполнить его «бабоч-кой», т.е таким образом:
 */
public class ArrayButterfly {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == 4) {
                    array[i][j] = 1;
                }
                if (i == 1 || i == 3) {
                    if (j == 1 || j == 2|| j == 3) {
                        array[i][j] = 1;
                    }
                }
                if (i == 2) {
                    if (j == 2) {
                        array[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}


