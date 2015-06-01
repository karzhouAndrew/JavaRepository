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
        List<Integer> gradeList = getGradeList(getStudentList());
        System.out.println(gradeList);
        List<Integer> gradeReqList = getGradeRequiredList(gradeList);
        System.out.println(gradeReqList);
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

    private static List<Integer> getGradeRequiredList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < GRADE_REQUIRED) {
                iterator.remove();
            }
        }
        return list;
    }
}
