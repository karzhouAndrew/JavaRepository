package additionalTask9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionalTask9 {
    private static final String NUMBERS_PATTERN = "\\d+";

    public static String replaceChild(String text) {
        return text.replaceAll("child", "children");
    }

    public static StringBuilder deleteNumbers(String text) {
        StringBuilder textWithoutNumbers = new StringBuilder(text);
        Pattern pattern = Pattern.compile(NUMBERS_PATTERN);
        Matcher matcher = pattern.matcher(text);
        int numbersQuantity = 0;
        while (matcher.find()) {
            textWithoutNumbers.delete(matcher.start() - numbersQuantity, matcher.end() - numbersQuantity);
            numbersQuantity += matcher.end() - matcher.start();
        }
        return textWithoutNumbers;
    }
}

