package lab12;

/*В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
 */
public class Main {
    public static void main(String[] args) {
        int marks[] = new int[10];
        int markMax = marks[0];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
            if (markMax < marks[i]) {
                markMax = i;
            }
        }
        System.out.print(markMax + " ");
    }
}
