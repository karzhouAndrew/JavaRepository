package Lab27;

// Создать коллекцию, наполнить ее случайными числами.
// Удалить повторяющиеся числа.

import java.util.*;

public class Lab27 {

    final static int SIZE = 10;

    public static void main(String[] args) {
        List<Integer> list = getRandomIntegerList(SIZE);
        System.out.println(list);
        System.out.println(getUniqueIntegerList(list));
    }

    private static List<Integer> getUniqueIntegerList(List<Integer> list) {
        //Iterator<Integer> iterator = list.listIterator();
        //ListIterator<Integer> iterator = list.listIterator();
        Iterator<Integer> iterator = list.listIterator();
        //Iterator<Integer> subIterator = list.listIterator();
        //Iterator<Integer> innerIterator = list.iterator();
        ArrayList list2 = list.clone();
        for (int value: list) {
            while (iterator.hasNext()) {
                if (iterator.next() == value) {
                    iterator.remove();
                }
            }
        }
/*        while (iteratorI.hasNext()) {
            int value = iteratorI.next();
            //int index = iterator.nextIndex();
            System.out.println(value);
            ListIterator<Integer> iteratorJ = list.listIterator();
            List<Integer> tempList = list.subList(iteratorJ.nextIndex(), SIZE);
            while (iteratorJ.hasNext()) {
                if (iteratorJ.next() == value) {
                    iteratorJ.remove();
                }
            }
        }*/


        return list;
    }

    private static List<Integer> getRandomIntegerList(int size) {
        List<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 5 + 1));
        }
        return arrayList;
    }
}
