/**
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а
 * ее номер.
 */
public class MaxMark {
    public static void main(String[] args) {
        int[] arrayMarks = {5, 6, 8, 1, 2};
        int maxMark = arrayMarks[0];
        int indexMax = 0;
        for (int i = 0; i < arrayMarks.length; i++) {
            if (arrayMarks[i] > maxMark) {
                indexMax = i;
            }
        }
        System.out.println("Номер максимальной оценки " + indexMax);
    }
}