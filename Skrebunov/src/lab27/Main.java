package lab27;

import java.util.List;

// Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа

public class Main {
    public static void main(String[] args) {
        Repeats emppty = new Repeats();
        List<Integer> numbers = emppty.createList(10);
        System.out.println(numbers);
        List<Integer> uniqueNumbers = emppty.deleateRepeats(numbers);
        System.out.println(uniqueNumbers);
    }
}
