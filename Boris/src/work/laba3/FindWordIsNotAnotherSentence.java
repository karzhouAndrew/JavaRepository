package work.laba3;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3.	Найти такое слово в первом предложении, которого нет ни в одном из остальных предложений.
public class FindWordIsNotAnotherSentence {
    private static final Pattern PATTERN_SENTENCE = Pattern.compile("[A-ZА-Я0-9][^.?!]+[.?!]+");
    private static final String REGEX_FOR_SPLIT_WORD = "[ \\p{Punct}]+";

    public String getWord(String str) {
        Matcher matcher = PATTERN_SENTENCE.matcher(str);
        matcher.find();
        String[] arrayWordFirstSentence = wordArray(matcher.group());
        while (matcher.find()) {
            String[] compareSentence = wordArray(matcher.group());
            if (arrayWordFirstSentence.length != 0) {
                arrayWordFirstSentence = compareWord(arrayWordFirstSentence, compareSentence);
            } else {
                return "NULL. Все слова в первом предложении встречаются хотя бы раз в последующих.";
            }
        }
        return Arrays.toString(arrayWordFirstSentence);
    }

    private String[] compareWord(String[] arrayWordFirstSentence, String[] compareSentence) {
        for (String compareWord : compareSentence) {
            for (int i = 0; i < arrayWordFirstSentence.length; i++) {
                while (compareWord.equalsIgnoreCase(arrayWordFirstSentence[i])) {
                    arrayWordFirstSentence = deleteWord(arrayWordFirstSentence, i);
                    if (arrayWordFirstSentence.length <= i) {
                        break;
                    }
                }
            }
        }
        return arrayWordFirstSentence;
    }

    private String[] deleteWord(String[] arrayWord, int indexWord) {
        String[] arrayWithOutWord = new String[arrayWord.length - 1];
        for (int i = 0; i < indexWord; i++) {
            arrayWithOutWord[i] = arrayWord[i];
        }
        for (int i = indexWord + 1; i < arrayWord.length; i++) {
            arrayWithOutWord[i - 1] = arrayWord[i];
        }
        return arrayWithOutWord;
    }

    private String[] wordArray(String str) {
        return str.trim().split(REGEX_FOR_SPLIT_WORD);
    }
}
