package lab27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PC on 17.06.2015.
 */
public class Repeats {
    public List<Integer> createList(int size) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * 10 + 1));
        }
        return numbers;
    }

    public List<Integer> deleateRepeats(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            Iterator<Integer> iterator = numbers.listIterator(i + 1);
            while (iterator.hasNext()) {
                if (iterator.next() == number) {
                    iterator.remove();
                }
            }
        }
        return numbers;
    }
}
