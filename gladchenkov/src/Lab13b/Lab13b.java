package Lab13b;

/**
 * Перевернуть массив на 90 градусов
 */
public class Lab13b {
    public static void main(String[] args) {
        int marks[][] = new int[4][4];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                marks[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            for (int j = marks.length - 1; j >= 0; j--)
                System.out.print(marks[j][i] + " ");
            System.out.println();
        }

    }
}
