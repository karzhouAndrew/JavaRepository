package Lab12;

/**
 * В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер
 */
public class Lab12 {
    public static void main(String[] args) {
        int marks[] = new int[10];
        int maxMark = marks[0];

        for (int i = 0; i < marks.length; i++) {  //заполнение массива числами
            marks[i] = (int) (Math.random() * 10 + 1);
            System.out.println("Ученик № " + i + " = " + marks[i]);

        }
        for (int mark : marks) {  //поиск максимального числа в массиве
            if (maxMark < mark) {
                maxMark = mark;
            }
        }

        for (int i = 0; i < marks.length; i++) { //вывод максимального индекса максимального числа
            if (marks[i] == maxMark) {
                System.out.println("Ученик " + i + " c максимальной оценкой " + maxMark);
            }
        }
        System.out.println("Максимальная оценка: " + maxMark);
    }
}
