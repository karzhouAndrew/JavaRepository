package lab28;

// Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab28 {

    private final static int GROUP_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> gradeList = getGradeList(getStudentList());
        System.out.println(gradeList);
        System.out.println(getMaxValue(gradeList));
    }

    public static List<Integer> getGradeList(List<Student> studentList) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            list.add((studentList.get(i)).getGrade());
        }
        return list;
    }

    private static List<Student> getStudentList() {
        List<Student> list = new ArrayList<Student>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            int randomGrade = (int) (Math.random() * 10) + 1;
            list.add(new Student(randomGrade));
        }
        return list;
    }

    private static int getMaxValue(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
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
