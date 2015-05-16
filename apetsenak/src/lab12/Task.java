package lab12;

/**
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class Task {
    public static void main(String[] args) {
        int marks[] = new int[20];
        int indexMax = 0;
        int maxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                indexMax = i;
            }
        }
        System.out.println();
        System.out.println(indexMax);
    }
}
