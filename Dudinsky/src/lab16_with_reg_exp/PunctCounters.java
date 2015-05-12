package lab16_with_reg_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctCounters {
    public int calculatePunct(String givenPunctStr) {
        int punctCounter = 0;
        Pattern patternPunct = Pattern.compile("\\p{Punct}");
        Matcher matcher = patternPunct.matcher(givenPunctStr);
        while (matcher.find()) {
            punctCounter++;
        }
        return punctCounter;
    }
}
