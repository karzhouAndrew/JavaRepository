package lab30;
/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

import java.io.IOException;

public class Lab30Main {
    public static void main(String[] args) throws IOException {
        String text = TextOperations.readFile("input.txt");
        System.out.println(text);
        System.out.println("количество запятых: " + TextOperations.countCommas(text));
        System.out.println("количество слов: " + TextOperations.countWords(text));
    }
}
