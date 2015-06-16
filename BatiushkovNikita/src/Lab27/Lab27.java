package Lab27;

// Создать коллекцию, наполнить ее случайными числами.
// Удалить повторяющиеся числа.

import java.util.*;

public class Lab27 {

    private final static int SIZE = 10;

    public static void main(String[] args) {
        List<Integer> randomIntegers = getRandomIntegers();
        System.out.println(randomIntegers);
        System.out.println(getUniqueIntegers(randomIntegers));
        System.out.println(getUniqueIntegers2(randomIntegers));
    }

    private static List<Integer> getUniqueIntegers(List<Integer> integers) {
        List<Integer> uniqueIntegers = new ArrayList<Integer>(SIZE);
        for (int value : integers) {
            if (!uniqueIntegers.contains(value)) {
                uniqueIntegers.add(value);
            }
        }
        return uniqueIntegers;
    }

    private static Set<Integer> getUniqueIntegers2(List<Integer> integers) {
        Set<Integer> uniqueIntegers = new HashSet<Integer>(SIZE);
        for (int value : integers) {
            uniqueIntegers.add(value);
        }
        return uniqueIntegers;
    }

    private static List<Integer> getRandomIntegers() {
        List<Integer> integers = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            integers.add((int) (Math.random() * 10 + 1));
        }
        return integers;
    }
}
