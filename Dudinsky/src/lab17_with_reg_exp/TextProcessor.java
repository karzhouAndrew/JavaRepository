package lab17_with_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String WORD_COUNT_PATTERN = "[А-Яа-яЁёA-Za-z]+";

    public int calculateWords(String givenStr) {
        int wordCounter = 0;
        Pattern patternWord = Pattern.compile(WORD_COUNT_PATTERN);
        Matcher matcher = patternWord.matcher(givenStr);
        while (matcher.find()) {
            wordCounter++;
        }
        return wordCounter;
    }
}