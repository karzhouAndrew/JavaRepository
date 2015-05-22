package lab28;

// Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab28 {

    final static int SIZE = 10;

    public static void main(String[] args) {
        List<Integer> list = getRandomIntegerList(SIZE);
        System.out.println(list);
        System.out.println(getListMaxValue(list));
    }

    private static int getListMaxValue(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int maxValue = 0;
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value >= maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
        return arrayList;
    }
}
