package lab12;

//Индекс максимальной оценки
public class Lab12 {
    public static void main(String[] args) {
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10);
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int maxMark = marks[0];
        int maxInd = 0;
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
                maxInd = i;
            }
        }
        System.out.println("Индекс максимальной оценки " + maxInd);
    }
}
