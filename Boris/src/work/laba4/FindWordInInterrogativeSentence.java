package work.laba4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4.	Во всех вопросительных предложениях текста найти и напечатать слова заданной длины.
public class FindWordInInterrogativeSentence {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");
    private static final String REGEX_FOR_SPLIT_WORD = "[ \\p{Punct}]+";

    public static String getWords(String str, int sizeWord) {
        Matcher matcher = PATTERN_SENTENCE.matcher(str);
        StringBuilder wordsOut = new StringBuilder();
        while (matcher.find()) {
            String sentence = matcher.group();
            if (sentence.endsWith("?")) {
                wordsOut.append(findWords(sentence, sizeWord));
            }
        }
        if (wordsOut.toString().length() == 0) {
            return "Слов заданной длины не найдено.";
        }
        return wordsOut.toString();
    }

    private static String findWords(String sentence, int sizeWord) {
        StringBuilder findingWord = new StringBuilder();
        for (String word : sentence.split(REGEX_FOR_SPLIT_WORD)) {
            if (word.length() == sizeWord) {
                findingWord.append(word).append(" ");
            }
        }
        return findingWord.toString();
    }
}
