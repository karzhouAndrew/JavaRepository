package work.laba1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1.	Найти и вывести предложение из текста, в котором максимальное количество одинаковых слов.

public class FindSentenceMaxSameSentence {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");

    public static String getSentence(String str) {
        Matcher matcherSentence = PATTERN_SENTENCE.matcher(str);
        StringBuilder sentenceMax = new StringBuilder();
        int sameWordMax = 0;
        while (matcherSentence.find()) {
            String sentence = matcherSentence.group();
            int currentQuantitySameWord = getQuantitySameWord(sentence);
            if (sameWordMax < currentQuantitySameWord) {
                sameWordMax = currentQuantitySameWord;
                sentenceMax.append(sentence);
            } else if (sameWordMax == currentQuantitySameWord) {
                sentenceMax.append("\n").append(sentence);
            }
        }
        return sentenceMax.toString();
    }

    private static int getQuantitySameWord(String str) {
        String[] arrayWords = str.split("[ \\p{Punct}]+");
        int quantitySameWord = 0;
        for (int i = 0; i < arrayWords.length - 1; i++) {
            String compareWord = arrayWords[i];
            for (int j = i + 1; j < arrayWords.length; j++) {
                if (compareWord.equalsIgnoreCase(arrayWords[j])) {
                    quantitySameWord++;
                    break;
                }
            }
        }
        return quantitySameWord;
    }
}
