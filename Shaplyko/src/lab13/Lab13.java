package lab13;

/**
 * Задание 13
 * Создать массив, заполнить его случайными элементами, распеча-тать, перевернуть, и снова распечатать (при переворачивании нежела-тельно создавать еще один массив).
 * для одномерного массива простая задача
 */
public class Lab13 {
    public static void main(String[] args) {
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.println(marks[i]);
        }
        int n = marks.length - 1;
        int transit;
        for (int i = 0; i < (marks.length / 2); i++) {
            transit = marks[i];
            marks[i] = marks[n];
            marks[n] = transit;
            n--;
        }
        System.out.println("Результат: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
