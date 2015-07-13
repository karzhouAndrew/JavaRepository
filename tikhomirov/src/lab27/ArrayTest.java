package lab27;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа
 */

public class ArrayTest {
    private static final int MAX_VALUE = 8;
    private static final int NUMBER = 10;

    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int i = 0; i < NUMBER; i++) {
            numbersList.add((int) (Math.random() * MAX_VALUE));
        }
        System.out.println("Первоначальный массив");
        System.out.println("numbersList = " + numbersList);
        int counter = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            for (int j = i + 1; j < numbersList.size(); j++) {
                if (numbersList.get(i).equals(numbersList.get(j))) {
                    counter++;
                }
                if (counter == 1) {
                    numbersList.remove(j);
                    counter = 0;
                    j--;
                }
            }
        }
        System.out.println("Без повторяющихся элементов");
        System.out.println("numbersList = " + numbersList);
    }
}
