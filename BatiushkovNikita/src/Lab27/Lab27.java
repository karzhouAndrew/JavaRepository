package Lab27;

// Создать коллекцию, наполнить ее случайными числами.
// Удалить повторяющиеся числа.

import java.util.ArrayList;
import java.util.List;

public class Lab27 {

    final static int SIZE = 10;

    public static void main(String[] args) {
        getRandomIntegerList(SIZE);

    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        return arrayList;
    }
}
