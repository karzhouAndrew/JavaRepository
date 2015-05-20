package laba16r;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка. Найти и подсчитать все знаки препинания

public class FindPunctuations {
    private final static Pattern PATTERN_PUNCTUATION = Pattern.compile("\\p{Punct}");

    public static int getQuantityPunctual(String str) {
        int size = str.length();
        int quantityPunctual = 0;
        while (size > 0) {
            char letter = str.charAt(str.length() - size);
            if (letter == ',' || letter == '.' || letter == ':' || letter == ';' || letter == '!' || letter == '?' ||
                    letter == '(' || letter == ')' || letter == '{' || letter == '}' || letter == '[' || letter == ']'
                    || letter == '/' || letter == '\'') {
                quantityPunctual++;
            }
            size--;
        }
        return quantityPunctual;
    }

    public static int getQuantityPunctualOther(String str) {
        Matcher matcher = PATTERN_PUNCTUATION.matcher(str);
        int quantityPunctual = 0;
        while (matcher.find()) {
            quantityPunctual++;
        }
        return quantityPunctual;
    }
}
