package lab12;

/**
 * Задание 12
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class Lab12 {
    public static void main(String[] args) {
        int marks[] = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.println(marks[i]);
        }
        int maxMark = marks[0];
        int maxMarkInd = 0;
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxMarkInd = i;
            }
        }
        System.out.println("первый встретившийся индекс максимальной оценки = " + maxMarkInd);
    }
}
