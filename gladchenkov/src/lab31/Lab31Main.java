package lab31;
/**
 * Имеется файл с текстом, в котором присутствуют числа.
 * Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.
 */

import java.io.IOException;
import java.util.List;

public class Lab31Main {
    public static void main(String[] args) throws IOException {
        String text = TextOperations.readFile("input.txt");
        List<Integer> listOfNumbers = TextOperations.searchNumbers(text);
        System.out.println("Числа в тексте: " + listOfNumbers);
        System.out.println("Сумма чисел в тексте: " + TextOperations.calculateNumbers(listOfNumbers));
        System.out.println("Уникальные числа: " + TextOperations.removeDuplicateNumbers(listOfNumbers));
    }
}
