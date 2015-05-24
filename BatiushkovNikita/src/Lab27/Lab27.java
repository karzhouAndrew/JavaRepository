package Lab27;

// Создать коллекцию, наполнить ее случайными числами.
// Удалить повторяющиеся числа.

import java.util.*;

public class Lab27 {

    public final static int SIZE = 10;

    public static void main(String[] args) {
        List<Integer> list = getRandomIntegerList(SIZE);
        System.out.println(list);
        System.out.println(getUniqueIntegerList(list));
        System.out.println(getUniqueIntegerList2(list));
    }

    private static List<Integer> getUniqueIntegerList2(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<Integer>();
        for (int value : list) {
            if (!uniqueList.contains(value)) {
                uniqueList.add(value);
            }
        }
        return uniqueList;
    }

    private static Set<Integer> getUniqueIntegerList(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(SIZE);
        for (int value : list) {
            set.add(value);
        }
        return set;
    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        return arrayList;
    }
}
