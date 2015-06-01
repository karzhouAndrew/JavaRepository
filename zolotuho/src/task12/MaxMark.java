package task12;

import java.util.Arrays;
import java.util.Random;

//В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер
public class MaxMark {
    public static void main(String[] args) {
        Random random = new Random();
        int[] marks = new int[30];
        int maxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(10);
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        System.out.println(Arrays.toString(marks));
        System.out.println();
        System.out.println("index of max marks");
        for (int i = 0; i < marks.length; i++) {
            if (maxMark == marks[i]) {
                System.out.print(" " + i + " ");
            }
        }
    }
}
