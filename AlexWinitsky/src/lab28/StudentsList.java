package lab28;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Master on 21.05.2015.
 */
public class StudentsList {

    public void printStudentsList(List<Students> studentsList) {
        for (Students student : studentsList) {
            System.out.println(student);
        }
    }

    public Students bestStudent(List<Students> studentsList) {
        Students bestStudent = studentsList.get(0);
        Iterator<Students> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (bestStudent.getMark() < student.getMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
