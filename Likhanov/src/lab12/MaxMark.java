package lab12;

/**
 * The task is to find tha max mark and display the number of the student
 **/
public class MaxMark {
    public static void main(String[] args) {
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
        }
        int maxMark = 0;
        int studentNum = 0;
        for (int j = 0; j < marks.length; j++) {
            if (marks[j] > maxMark) {
                maxMark = marks[j];
                studentNum = j;
            }
        }
        System.out.println("Tha highest mark is " + maxMark + ", got the student #" + studentNum);
    }
}
