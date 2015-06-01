package lab17;

import java.util.Scanner;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте.
 * Желательно учесть, что слова могут разделяться несколькими пробелами,
 * в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation calc = new Calculation();
        System.out.println("Введите текст : ");
        System.out.println("numberOfWords = " + calc.calculationNumberOfWords(sc.nextLine()));
        sc.close();
    }
}
