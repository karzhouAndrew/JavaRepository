package Lab13;

/**
 * Создать массив, заполнить его случайными элементами, распеча-тать, перевернуть, и снова распечатать (при переворачивании нежела-тельно создавать еще один массив).
 */
public class Lab13 {
    public static void main(String[] args) {
        int marks[] = new int[10];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
            System.out.println("Ученик № " + i + " = " + marks[i]);
        }
        System.out.println();
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Ученик № " + i + " = " + marks[i]);
        }
    }
}
