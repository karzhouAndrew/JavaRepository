package lab17_with_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {
    public int calculateWords(String givenStr) {
        int wordCounter = 0;
        Pattern patternWord = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = patternWord.matcher(givenStr);
        while (matcher.find()) {
            wordCounter++;
        }
        return wordCounter;
    }
}
