package task18;

import java.util.Scanner;

//Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class Task18Test {
    public static void main(String[] args) {
        System.out.println("Введите текст.");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        System.out.println("Полученный текст: " + Task18.getLastWordsLetters(text));
    }
}
