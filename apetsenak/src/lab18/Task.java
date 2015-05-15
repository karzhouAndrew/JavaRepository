package lab18;

import java.util.Scanner;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WorkWithText text = new WorkWithText();
        System.out.println("Введите текст : ");
        System.out.println("Текст из последних букв слов - " + text.createNewText(sc.nextLine()));
        sc.close();
    }
}
