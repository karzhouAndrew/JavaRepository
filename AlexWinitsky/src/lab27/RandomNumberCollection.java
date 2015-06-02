package lab27;

import java.util.List;

/**
 * Created by Master on 22.05.2015.
 */
public class RandomNumberCollection {

    public List<Integer> addNumber(List<Integer> collection) {
        for (int i = 0; i < 10; i++) {
            collection.add((int) (Math.random() * 10));
        }
        return collection;
    }

    public void printCollection(List<Integer> collection) {
        for (Integer element : collection) {
            System.out.print(element + " ");
        }
    }

    public List<Integer> deleteRepeatNumber(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            Integer element = collection.get(i);
            for (int j = i + 1; j < collection.size(); j++) {
                if (element == collection.get(j)) {
                    collection.remove(j);
                    j--;
                }
            }
        }
        return collection;
    }

}
