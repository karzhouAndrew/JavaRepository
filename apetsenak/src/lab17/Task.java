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
        System.out.println("Введите текст : ");
        String text = sc.nextLine();
        int numberOfWords = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i != 0 && (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == ',')) {
                if (text.charAt(i - 1) != ' ' && text.charAt(i - 1) != '.' && text.charAt(i - 1) != ',') {
                    numberOfWords++;
                }
            } else if (i == 0 && (text.charAt(i) != ' ' && text.charAt(i) != '.' && text.charAt(i) != ',')) {
                numberOfWords++;
            }
        }
        System.out.println("numberOfWords = " + numberOfWords);
        sc.close();
    }
}
