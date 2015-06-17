package lab28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 17.06.2015.
 */
public class MaxScore {
    public List<Integer> createList(int size) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * 10 + 1));
        }
        return numbers;
    }

    public int maxScore(List<Integer> scores) {
        Iterator<Integer> score = scores.iterator();
        int maxScore = 0;
        while (score.hasNext()) {
            int temp = score.next();
            if (temp > maxScore) {
                maxScore = temp;
            }
        }
        return maxScore;
    }
}
