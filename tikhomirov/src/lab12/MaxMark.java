package lab12;

/**
 * Вывести порядковый номер ученика с максимальной оценкой
 */
public class MaxMark {
    public static void main(String[] args) {
        int studentsNumber = 15;
        int[] studentsMark = new int[studentsNumber];
        for (int i = 0; i < studentsMark.length; i++) {
            studentsMark[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < studentsMark.length; i++) {
            System.out.println("studentsMark [" + i + "]= " + studentsMark[i]);
        }
        int maxMark = studentsMark[0];
        for (int mark : studentsMark) {
            if (maxMark < mark) {
                maxMark = mark;
            }
        }
        System.out.print("Номер(-а) ученика(-ов) с максимальной оценкой " + maxMark + ": ");
        for (int i = 0; i < studentsMark.length; i++) {
            if (maxMark == studentsMark[i]) {
                System.out.print("#" + i + "; ");
            }
        }
    }
}
