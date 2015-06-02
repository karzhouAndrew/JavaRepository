package lab27;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 27
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
 */
public class DeleteRepeatNumber {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<Integer>();
        RandomNumberCollection function = new RandomNumberCollection();
        System.out.println("Первоначальная коллекция");
        function.printCollection(function.addNumber(collection));
        System.out.println("\n" + "Коллекция после удаления повторяющийхся элементов");
        function.printCollection(function.deleteRepeatNumber(collection));
    }
}
