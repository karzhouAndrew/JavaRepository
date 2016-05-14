package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 1) регулярные выражения многоточие и точка; 2) split() разрезать без удаления.
/*
Make the analysis of the text:
a) The number of consonants and vowels.
b) Print each sentence of the text in a separate line, indicating the number of characters in it.
c) Calculate the number of spaces and paragraphs (a paragraph is considered as a new line).
d) Create the new text, where all the spaces will be removed , and display it.
 */
public class Task07 {
    public static void main(String[] args) throws IOException {
        System.out.println("Put in the text: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println("a: There are " + getVowels(text) + " vowels and " + getConsonants(text) + " consonants.");
        System.out.println("b: ");
        printSentences(text);
        System.out.println("c: There are " + getSpaces(text) + " spaces and " + getParagraphs(text) + " paragraphs in the text.");
        System.out.println("d: ");
        removeSpaces(text);
    }

    private static void removeSpaces(String text) {
        System.out.println(text.replaceAll(" +", ""));
    }

    private static int getParagraphs(String text) {
        Pattern pattern = Pattern.compile("[!?.]");
        Matcher matcher = pattern.matcher(text);
        int paragraphs= 0;
        while(matcher.find()){
            paragraphs++;
        }
        return paragraphs;
    }

    private static int getSpaces(String text) {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(text);
        int spaces = 0;
        while (matcher.find()){
            spaces++;
        }
        return spaces;
    }

    private static void printSentences(String text) {
        String[] array = text.split("[!?.+]\\s+");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\"");
            array[i].replaceAll(" ", "");
            Pattern pattern = Pattern.compile("[^ ]");
            Matcher matcher = pattern.matcher(array[i]);
            int charNum = 0;
            while (matcher.find()) {
                charNum++;
            }
            System.out.println(" There are " + charNum + " chatacters in the sentence.");
        }
    }

    private static int getVowels(String text) {
        Pattern pattern = Pattern.compile("[aeiouy]");
        Matcher matcher = pattern.matcher(text);
        int vowels = 0;
        while (matcher.find()) {
            vowels++;
        }
        return vowels;
    }

    private static int getConsonants(String text) {
        Pattern patternC = Pattern.compile("[a-z&&[^aeiouy]]");
        Matcher matcherC = patternC.matcher(text);
        int consonants = 0;
        while (matcherC.find()) {
            consonants++;
        }
        return consonants;
    }
}
