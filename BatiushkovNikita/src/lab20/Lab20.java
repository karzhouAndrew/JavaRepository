package lab20;

// Find hex

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab20 {

    final static String regEx = "0x\\p{XDigit}{1,}";

    public static void main(String[] args) {
        String testString = "Aetu0x9A5F the inde0x12 this 0xF5 0xA7string0x59850xA0853AB0xGC56gur";
        System.out.println(getRegExpModifiedString(testString, regEx));
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
