package lab28;

import java.util.List;

/**
 * Created by PC on 24.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        MaxScore maxScore = new MaxScore();
        List<Integer> numbers = maxScore.createList(10);
        System.out.println(numbers);
        int bestScore = maxScore.calcMaxScore(numbers);
        System.out.println(bestScore);
    }
}
