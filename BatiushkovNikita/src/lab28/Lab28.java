package lab28;

// Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab28 {

    private final static int GROUP_SIZE = 10;

    public static void main(String[] args) {
        List<Integer> studentsRating = getGrades(getStudents());
        System.out.println(studentsRating);
        System.out.println(getMaxValue(studentsRating));
    }

    public static List<Integer> getGrades(List<Student> students) {
        List<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            grades.add((students.get(i)).getGrade());
        }
        return grades;
    }

    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < GROUP_SIZE; i++) {
            int randomGrade = (int) (Math.random() * 10) + 1;
            students.add(new Student(randomGrade));
        }
        return students;
    }

    private static int getMaxValue(List<Integer> students) {
        Iterator<Integer> iterator = students.iterator();
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
