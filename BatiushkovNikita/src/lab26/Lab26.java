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
        List<Integer> studentsRatingList = getGradeList(getStudentList());
        System.out.println(studentsRatingList);
        List<Integer> studentsReqRatingList = getGradeRequiredList(studentsRatingList);
        System.out.println(studentsReqRatingList);
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

    private static List<Integer> getGradeRequiredList(List<Integer> gradeRequiredList) {
        Iterator<Integer> iterator = gradeRequiredList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < GRADE_REQUIRED) {
                iterator.remove();
            }
        }
        return gradeRequiredList;
    }
}
