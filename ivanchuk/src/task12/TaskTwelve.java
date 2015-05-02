package task12;

// Для отчета необходимо указать наивысшую оценку, полученную учениками,
// то есть перед нами стоит задача поиска максимального элемента и
// вывода ее номера.

public class TaskTwelve {
    public static void main(String[] args) {
        int[] marks = new int[20];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Ученик №" + i + " = " + marks[i]);
        }
        int indexMaxMark = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > marks[indexMaxMark]) {
                indexMaxMark = i;
            }
        }
        System.out.println("Номер максимальной оценки: " + indexMaxMark);
    }
}
