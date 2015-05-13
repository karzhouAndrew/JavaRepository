package lab12;

import java.util.Random;

/* Задание 12. В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер. */
public class Task12 {
    public static void main(String[] args) {
        int marks[] = new int[20];
        Random rand = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(11);
            System.out.println("Ученик №" + i + " - Оценка: " + marks[i]);
        }
        int maxMarkIndex = 0;
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxMark) {
                maxMarkIndex = i;
                maxMark = marks[i];
            }
        }
        System.out.println("Номер первого по списку ученика с максимальной оценкой: " + maxMarkIndex);
        System.out.print("Номера всех учеников с максимальной оценкой (равной " + maxMark + "):");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == maxMark) {
                System.out.print(" " + i);
            }
        }
    }
}