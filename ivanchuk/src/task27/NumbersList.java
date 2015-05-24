package task27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumbersList {
    private List<Integer> numbersList;

    public NumbersList(int numberQuantity) {
        numbersList = new ArrayList<Integer>(numberQuantity);
        for (int i = 0; i < numberQuantity; i++) {
            numbersList.add((int) (Math.random() * 20));
        }
    }

    @Override
    public String toString() {
        StringBuilder marks = new StringBuilder("[ ");
        for (int number : numbersList) {
            marks.append(number).append(" ");
        }
        marks.append("]");
        return new String(marks);
    }

    public void deleteRepeatingNumbers() {
        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            Iterator<Integer> iterator = numbersList.listIterator(i + 1);
            while (iterator.hasNext()) {
                if (iterator.next() == number) {
                    iterator.remove();
                }
            }
        }
    }
}
