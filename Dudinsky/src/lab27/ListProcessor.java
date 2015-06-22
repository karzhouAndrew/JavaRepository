package lab27;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListProcessor {

    private List<Integer> processingList;

    public ListProcessor(List<Integer> processingList) {
        this.processingList = processingList;
    }

    public void fillUpWithRandoms(final int GIVEN_QUANTITY, final int RAND_GENERATOR_LIMIT) {
        Random rand = new Random();
        for (int i = 0; i < GIVEN_QUANTITY; i++) {
            processingList.add(rand.nextInt(RAND_GENERATOR_LIMIT) + 1);
        }
    }

    public void deleteAllRepeats() {
        for (int i = 0; i < processingList.size(); i++) {
            Iterator<Integer> procListIterator = processingList.listIterator(i);
            int currentElement = procListIterator.next();
            while (procListIterator.hasNext()) {
                if (procListIterator.next() == currentElement) {
                    procListIterator.remove();
                }
            }
        }
    }
}