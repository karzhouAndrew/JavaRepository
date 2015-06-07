package stringTask4;

import java.util.Scanner;

public class TestWordInQuestionsFinder {
    public static void main(String[] args) {
        String string = "bksbd  jksd v ksjbvk! kjbwkdjb dv sfv k hvbh? qqqqq qqqqqqq jbkdjbvk?!  junw.";
        Scanner input = new Scanner(System.in);
        WordsInQuestionsFinder wordInQuestionFinder = new WordsInQuestionsFinder();
        String questionSentences = wordInQuestionFinder.obtainQuestionSentences(string);
        String[] words = wordInQuestionFinder.splitToWords(questionSentences);
        System.out.println("original text");
        System.out.println(string);
        System.out.print("enter word length ");
        int sizeShowedWord;
        if (input.hasNextInt()) {
            sizeShowedWord = input.nextInt();
        } else {
            sizeShowedWord = 0;
        }
        input.close();
        System.out.println("word from question sentences");
        wordInQuestionFinder.showCertainLengthWords(words, sizeShowedWord);
    }
}
