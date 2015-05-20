package task17;

import java.util.Scanner;

public class TestWordCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String stringTest = sc.nextLine();
        WordCounter wordCount = new WordCounter();
        int numberWords = wordCount.calculateWords(stringTest);
        System.out.println("Number of words in the string is " + numberWords);
    }
}
