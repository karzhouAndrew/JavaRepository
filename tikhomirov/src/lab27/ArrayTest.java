package lab27;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа
 */

public class ArrayTest {
    static final int MAX_VALUE = 8;
    static final int NUMBER = 10;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < NUMBER; i++) {
            arrayList.add((int) (Math.random() * MAX_VALUE));
        }
        System.out.println("Первоначальный массив");
        System.out.println("arrayList = " + arrayList);
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    counter++;
                }
                if (counter == 1) {
                    arrayList.remove(j);
                    counter = 0;
                    j--;
                }
            }
        }
        System.out.println("Без повторяющихся элементов");
        System.out.println("arrayList = " + arrayList);
    }
}
