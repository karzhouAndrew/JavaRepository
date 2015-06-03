package task27;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.List;

public class TaskTest {
    public static void main(String[] args) {
        NumbersList numbersList = new NumbersList(10);
        System.out.println("Исходный список чисел:");
        System.out.println(numbersList);
        List<Integer> numbers = numbersList.deleteRepeatingNumbers();
        System.out.println("После удаления повторяющихся чисел:");
        System.out.println(numbers);
    }
}
