package lab26;

import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 24.06.2015.
 */
public class Students {
    public List<Student> createScores(List<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            studentList.get(i).setScore((int) (Math.random() * 10 + 1));
        }
        return studentList;
    }

    public List<Student> deleteScores(List<Student> studentList) {
        int negativeScore = 4;
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getScore() < negativeScore) {
                iterator.remove();
            }
        }
        return studentList;
    }
}
