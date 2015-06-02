package lab26;

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

    public List<Students> bestStudents(List<Students> studentsList) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getMark() < 6) {
                studentsList.remove(i);
                i--;
            }
        }
        return studentsList;
    }

    public List<Students> bestMark(List<Students> studentsList) {
        Iterator<Students> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getMark() < 6) {
                iterator.remove();
            }
        }
        return studentsList;
    }
}
