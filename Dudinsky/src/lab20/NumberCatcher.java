package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCatcher {
    private final String HEX_CATCH_PATTERN = "-?0[xX]\\p{XDigit}+";

    public String catchAllHexes(String givenStr) {
        Pattern patternHex = Pattern.compile(HEX_CATCH_PATTERN);
        Matcher matcher = patternHex.matcher(givenStr);
        StringBuilder strBuilder = new StringBuilder();
        while (matcher.find()) {
            strBuilder.append(matcher.group()).append(" ");
        }
        return strBuilder.toString();
    }
}