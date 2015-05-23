package lab26;

// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab26 {

    final static int SIZE = 10;
    final static int GRADE_REQUIRED = 5;

    public static void main(String[] args) {
        List<Integer> list = getRandomIntegerList(SIZE);
        System.out.println(list);
        List<Integer> gradedList = getGradedList(list);
        System.out.println(gradedList);
    }

    private static List<Integer> getGradedList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < GRADE_REQUIRED) {
                iterator.remove();
            }
        }
        return list;
    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        return arrayList;
    }
}
