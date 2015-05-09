package labs;

/**
 * Created by asus on 30.04.2015.
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а её индекс
 */
public class Ex12 {
    public static void main(String[] args) {
        int[] marks = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.print(marks[i] + " ");
        }
        int maxMark = marks[0];
        int maxIndex = 0;
        for (int i = 1; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальная оценка " + maxMark + "; Её индекс " + maxIndex + ";");
    }
}
