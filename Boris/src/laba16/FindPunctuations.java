package laba16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка. Найти и подсчитать все знаки препинания
public class FindPunctuations {
    private final static Pattern pattern = Pattern.compile("\\p{Punct}");

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
        Matcher matcher = pattern.matcher(str);
        int quantityPunctual = 0;
        while (matcher.find()) {
            quantityPunctual++;
        }
        return quantityPunctual;
    }
}
