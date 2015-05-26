package task29;

import java.util.HashMap;
import java.util.Map;

public class Task29 {
    private static Map<String, Integer> wordsFrequency = new HashMap<String, Integer>();

    private static String[] getWords(String text) {
        String textWithoutSpace = text.trim();
        String[] wordsArray = textWithoutSpace.split(" +");
        for (int i = 0; i < wordsArray.length; i++) {
            wordsArray[i] = wordsArray[i].replaceAll("\\p{Punct}", "");
        }
        return wordsArray;
    }

    public static Map<String, Integer> getWordsFrequency(String text) {
        String[] wordsArray = getWords(text);
        for (String word : wordsArray) {
            word = word.toLowerCase();
            Integer wordFrequency = wordsFrequency.get(word);
            if (wordsFrequency.containsKey(word)) {
                wordsFrequency.put(word, ++wordFrequency);
            } else {
                wordsFrequency.put(word, 1);
            }
        }
        return wordsFrequency;
    }
}
