package task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task20 {
    private static final String PATTERN_OF_HEXADECIMAL = "0[xX][\\dA-Fa-f]+";

    public static StringBuilder searchOfHexadecimalNumbers(String text) {
        StringBuilder numbers = new StringBuilder();
        Pattern pattern = Pattern.compile(PATTERN_OF_HEXADECIMAL);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            numbers.append(matcher.group()).append(" ");
        }
        return numbers;
    }
}
