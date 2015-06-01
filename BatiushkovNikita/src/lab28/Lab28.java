package lab28;

// Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab28 {

    private final static int GROUP_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> studentsRatingList = getGradeList(getStudentList());
        System.out.println(studentsRatingList);
        System.out.println(getMaxValue(studentsRatingList));
    }

    public static List<Integer> getGradeList(List<Student> studentList) {
        List<Integer> gradeList = new ArrayList<Integer>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            gradeList.add((studentList.get(i)).getGrade());
        }
        return gradeList;
    }

    private static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            int randomGrade = (int) (Math.random() * 10) + 1;
            studentList.add(new Student(randomGrade));
        }
        return studentList;
    }

    private static int getMaxValue(List<Integer> studentList) {
        Iterator<Integer> iterator = studentList.iterator();
        int maxValue = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
