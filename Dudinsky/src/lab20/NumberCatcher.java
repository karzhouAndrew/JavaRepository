package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCatcher {

    public String catchAllHexes(String givenStr) {
        Pattern patternHex = Pattern.compile("-?0[xX]\\p{XDigit}+");
        Matcher matcher = patternHex.matcher(givenStr);
        StringBuilder strBuilder = new StringBuilder("");
        while (matcher.find()) {
            strBuilder.append(matcher.group()).append(" ");
        }
        return strBuilder.toString();
    }
}