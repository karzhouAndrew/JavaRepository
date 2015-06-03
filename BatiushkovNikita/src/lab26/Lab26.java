package lab26;

// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab26 {

    private final static int GROUP_SIZE = 10;
    private final static int GRADE_REQUIRED = 5;

    public static void main(String[] args) {
        List<Integer> studentsRating = getGrades(getStudents());
        System.out.println(studentsRating);
        List<Integer> studentsRatingReq = getGradesReq(studentsRating);
        System.out.println(studentsRatingReq);
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

    private static List<Integer> getGradesReq(List<Integer> gradeRequired) {
        Iterator<Integer> iterator = gradeRequired.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < GRADE_REQUIRED) {
                iterator.remove();
            }
        }
        return gradeRequired;
    }
}
