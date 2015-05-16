package lab18_with_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String WORD_COUNT_PATTERN = "[А-Яа-яЁёA-Za-z]+";

    public String catchLastLetters(String givenStr) {
        StringBuilder resultStrBuilder = new StringBuilder();
        Pattern patternWord = Pattern.compile(WORD_COUNT_PATTERN);
        Matcher matcher = patternWord.matcher(givenStr);
        while (matcher.find()) {
            resultStrBuilder.append(givenStr.charAt(matcher.end() - 1));
        }
        return resultStrBuilder.toString();
    }
}