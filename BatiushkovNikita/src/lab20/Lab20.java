package lab20;

// Find hex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab20 {
    public static void main(String[] args) {
        String testString = "Aetu0x9A5F the inde0x12 this 0xF5 0xA7string0x59850xA0853AB0xGC56gur";
        String regEx = "(0x[0-9A-Fa-f]{2})";
        StringBuilder modifiedString = getRegExpModifiedString(testString, regEx);
        System.out.println(modifiedString);
    }

    private static StringBuilder getRegExpModifiedString(String testString, String regEx) {
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(testString);
        StringBuilder modifiedString = new StringBuilder();
        while (matcher.find()) {
            modifiedString.append(matcher.group());
            modifiedString.append(" ");
        }
        return modifiedString;
    }
}
