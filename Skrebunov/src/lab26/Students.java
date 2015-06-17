package lab26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 17.06.2015.
 */
public class Students {
    public List<Integer> createscores(int size) {
        List<Integer> students = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            students.add((int) (Math.random() * 10 + 1));
        }
        return students;
    }

    public List<Integer> deleateScores(List<Integer> students) {
        int negativeScore = 4;
        Iterator<Integer> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < negativeScore) {
                iterator.remove();
            }
        }
        return students;
    }
}
