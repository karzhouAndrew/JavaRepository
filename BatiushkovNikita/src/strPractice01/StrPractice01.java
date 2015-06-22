package strPractice01;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrPractice01 {
    public static int getNumMaxSameWords(String[] words) {
        int numMaxSameWords = 0;
        for (int i = 0; i < words.length - 1; i++) {
            int count = 1;
            String compareWord = words[i];
            for (int j = i + 1; j < words.length; j++) {
                if (compareWord.equals(words[j])) {
                    count++;
                    if (numMaxSameWords <= count) {
                        numMaxSameWords = count;
                    }
                }
            }
        }
        return numMaxSameWords;
    }

    public static String getSentenceMaxSameWords(String text) {
        int maxCount = 0;
        String sentenceMaxSameWords = "";
        List<String> sentences = getSentenceList(text);
        for (int i = 0; i < sentences.size() - 1; i++) {
            String[] wordArray = getWordArray(sentences.get(i));
            int count = getNumMaxSameWords(wordArray);
            if (maxCount <= count) {
                maxCount = count;
                sentenceMaxSameWords = sentences.get(i);
            }
        }
        return sentenceMaxSameWords;
    }

    public static String[] getWordArray(String text) {
        return (text.replaceAll("\\p{Punct}", " ")).split("\\s+");
    }

    public static List<String> getSentenceList(String text) {
        List<String> sentences = new ArrayList<String>();
        Pattern pattern = Pattern.compile("[А-ЯA-Z].+?[.!?]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            sentences.add(matcher.group());
        }
        return sentences;
    }
}