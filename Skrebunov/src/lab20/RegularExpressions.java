package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    private final Pattern PATTERN = Pattern.compile("-?[xX][0-9a-fA-F]+");

    public String regular(String textWithHex) {
        StringBuilder str = new StringBuilder("Hexadecimal numbers - ");
        Matcher matcher = PATTERN.matcher(textWithHex);
        while (matcher.find()) {
            str.append(matcher.group());
            str.append(" ");
        }
        return str.toString();
    }
}
