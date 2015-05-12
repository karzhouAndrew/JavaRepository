package lab18;

import java.util.Scanner;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст : ");
        String text = sc.nextLine();
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            if (i != 0 && (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i) == ',')) {
                if (text.charAt(i - 1) != ' ' && text.charAt(i - 1) != '.' && text.charAt(i - 1) != ',') {
                    word = word.concat(text.substring(i - 1, i));
                }
            } else if (i + 1 == text.length()) {
                word = word.concat(text.substring(i, i + 1));
            }
        }
        System.out.println("word = " + word);
        System.out.println(word.length());
        sc.close();
    }
}
