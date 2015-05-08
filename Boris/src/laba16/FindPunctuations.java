package laba16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка. Найти и подсчитать все знаки препинания
public class FindPunctuations {
    private String str;
    private final Pattern pattern = Pattern.compile("\\p{Punct}");

    public FindPunctuations(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getQuantityPunctual() {
        int size = str.length();
        int quantityPunctual = 0;
        while (size > 0) {
            char letter = str.charAt(str.length() - size);
            if (letter == ',' || letter == '.' || letter == ':' || letter == ';' || letter == '!' || letter == '?' ||
                    letter == '(' || letter == ')' || letter == '{' || letter == '}' || letter == '[' || letter == ']'
                    || letter == '/'||letter=='\'') {
                quantityPunctual++;
            }
            size--;
        }
        return quantityPunctual;
    }

    public int getQuantityPunctOther() {
        Matcher matcher = pattern.matcher(str);
        int quantityPunctual = 0;
        while (matcher.find()) {
            quantityPunctual++;
        }
        return quantityPunctual;
    }
}
