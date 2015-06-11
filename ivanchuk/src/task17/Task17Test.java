package task17;

import java.util.Scanner;

//Имеется строка с текстом. Подсчитать количество слов в тексте.
//Желательно учесть, что слова могут разделяться несколькими пробелами,
//в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
public class Task17Test {
    public static void main(String[] args) {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println("Количество слов в тексте " + Task17.calculateWordsQuantity(text));
    }
}