package task27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumbersList {
    private List<Integer> numbers;

    public NumbersList(int numberQuantity) {
        numbers = new ArrayList<Integer>(numberQuantity);
        for (int i = 0; i < numberQuantity; i++) {
            numbers.add((int) (Math.random() * 20));
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }

    public List<Integer> deleteRepeatingNumbers() {
        List<Integer> result = new ArrayList<Integer>(numbers);
        for (int i = 0; i < result.size(); i++) {
            int number = result.get(i);
            Iterator<Integer> iterator = result.listIterator(i + 1);
            while (iterator.hasNext()) {
                if (iterator.next() == number) {
                    iterator.remove();
                }
            }
        }
        return result;
    }
}
