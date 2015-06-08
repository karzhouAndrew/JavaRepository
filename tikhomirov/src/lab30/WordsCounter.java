package lab30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounter {
    public int wordsCounter(String str) {
        int wordsNumber = 1;
        Pattern pattern = Pattern.compile(" +");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            wordsNumber++;
        }
        return wordsNumber;
    }
}
