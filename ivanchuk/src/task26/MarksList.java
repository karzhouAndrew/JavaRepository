package task26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MarksList {
    private List<Integer> marksList;

    public MarksList(int marksQuantity) {
        marksList = new ArrayList<Integer>(marksQuantity);
        for (int i = 0; i < marksQuantity; i++) {
            marksList.add((int) (Math.random() * 10 + 1));
        }
    }

    public String toString() {
        StringBuilder marks = new StringBuilder("[");
        for (int i = 0; i < marksList.size() - 1; i++) {
            marks.append(marksList.get(i)).append(", ");
        }
        marks.append(marksList.get(marksList.size() - 1)).append("]");
        return new String(marks);
    }

    public void deleteBadMarks() {
        Iterator<Integer> marksIterator = marksList.iterator();
        while (marksIterator.hasNext()) {
            if (marksIterator.next() <= 5) {
                marksIterator.remove();
            }
        }
    }
}
