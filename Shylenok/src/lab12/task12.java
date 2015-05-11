package lab12;

/*В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.
/**
 * Created by USER on 11.05.2015.
 */
public class task12 {
    public static void main(String[] args) {
        int[] marks = {5, 3, 7, 8, 4, 10, 6, 1, 3};
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (maxMark == marks[i]) {
                System.out.println("Индекс максимальной оценки - " +i);
            }
        }
    }
}
