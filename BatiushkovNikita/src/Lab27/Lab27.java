package Lab27;

// Создать коллекцию, наполнить ее случайными числами.
// Удалить повторяющиеся числа.

import java.util.*;

public class Lab27 {

    private final static int SIZE = 10;

    public static void main(String[] args) {
        List<Integer> randomIntegerList = getRandomIntegerList(SIZE);
        System.out.println(randomIntegerList);
        System.out.println(getUniqueIntegerList(randomIntegerList));
        System.out.println(getUniqueIntegerList2(randomIntegerList));
    }

    private static List<Integer> getUniqueIntegerList2(List<Integer> integerList) {
        List<Integer> uniqueIntegerList = new ArrayList<Integer>();
        for (int value : integerList) {
            if (!uniqueIntegerList.contains(value)) {
                uniqueIntegerList.add(value);
            }
        }
        return uniqueIntegerList;
    }

    private static Set<Integer> getUniqueIntegerList(List<Integer> integerList) {
        Set<Integer> integerSet = new HashSet<Integer>(SIZE);
        for (int value : integerList) {
            integerSet.add(value);
        }
        return integerSet;
    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        return arrayList;
    }
}
