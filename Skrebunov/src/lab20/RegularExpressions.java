package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public String regular(String textWithHex) {
        StringBuilder str = new StringBuilder("Hexadecimal numbers - ");
        Pattern pattern = Pattern.compile("-?[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(textWithHex);
        while (matcher.find()) {
            str.append(matcher.group());
            str.append(" ");
        }
        return str.toString();
    }
}
