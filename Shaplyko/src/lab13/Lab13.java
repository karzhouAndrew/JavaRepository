package lab13;

import java.util.Arrays;

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
        }
        System.out.println(Arrays.toString(marks));
        int index = marks.length - 1;
        for (int i = 0; i < (marks.length / 2); i++) {
            int temp = marks[i];
            marks[i] = marks[index];
            marks[index] = temp;
            index--;
        }
        System.out.println(Arrays.toString(marks));
    }
}
