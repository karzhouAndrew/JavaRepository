package lab30;

import java.io.IOException;

/**
 * Задание 30
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */

public class Lab30 {
    public static void main(String[] args) throws IOException {
        WorkFile text = new WorkFile();
        text.enterFile();
        text.outputFile();
        System.out.println("Слов: " + text.amountWord());
        System.out.println("Знаков пунктуации: " + text.amountPunctuation());
    }
}