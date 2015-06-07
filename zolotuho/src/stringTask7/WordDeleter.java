package stringTask7;

import java.util.Scanner;

public class WordDeleter {

    public String deleteWordWithLength(String string, int wordLength) {
        String regexpression = "[ ][eyuioa]{1}[\\w]{" + (wordLength - 1) + "}[ .,?!:;]";
        return string.replaceAll(regexpression, " ");
    }

    public static void main(String[] args) {
        String string = "jlkjkj gjghg evbvb, ufgfggggc eeefjhfh uuqqq rrr";
        WordDeleter wordDeleter = new WordDeleter();
        Scanner input = new Scanner(System.in);
        System.out.println("Original text");
        System.out.println(string);
        System.out.print("Enter word length you want to delete :");
        if (input.hasNextInt()) {
            String modifiedString = wordDeleter.deleteWordWithLength(string, input.nextInt());
            System.out.println("Modified text");
            System.out.println(modifiedString);
        } else {
            System.out.println("incorrect number");
        }
        input.close();
    }
}
