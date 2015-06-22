package lab27;

import java.util.ArrayList;
import java.util.List;

/* Задание 27. Создать коллекцию, наполнить ее случайными числами.
Удалить повторяющиеся числа. */

public class Task27 {
    public static void main(String[] args) {

        final int GIVEN_QUANTITY = 20;
        final int RAND_GENERATOR_LIMIT = 10;

        List<Integer> processingList = new ArrayList<>(GIVEN_QUANTITY);
        ListProcessor listProcessor = new ListProcessor(processingList);
        System.out.println("Исходная коллекция: " + processingList);
        listProcessor.fillUpWithRandoms(GIVEN_QUANTITY, RAND_GENERATOR_LIMIT);
        System.out.println("Результат заполнения " + GIVEN_QUANTITY + " случайными числами в диапазоне до " + RAND_GENERATOR_LIMIT + ":\n" + processingList);
        listProcessor.deleteAllRepeats();
        System.out.println("Результат удаления всех повторений:\n" + processingList);
    }
}