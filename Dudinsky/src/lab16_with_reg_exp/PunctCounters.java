package lab16_with_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctCounters {
    private final String PUNCT_COUNT_PATTERN = "\\p{Punct}";

    public int calculatePunct(String givenPunctStr) {
        int punctCounter = 0;
        Pattern patternPunct = Pattern.compile(PUNCT_COUNT_PATTERN);
        Matcher matcher = patternPunct.matcher(givenPunctStr);
        while (matcher.find()) {
            punctCounter++;
        }
        return punctCounter;
    }
}