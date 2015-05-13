package laba17;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Подсчитать кол-во слов в тексте.
public class FindWord {
    private final static Pattern PATTERNWORD = Pattern.compile("\\w+");

    public static int firstRealization(String str) {
        String strExample = str.trim();
        int quantityWord = 0;
        int index = 0;
        while (index != -1) {
            index = strExample.indexOf(' ', index);
            if (index != -1) {
                char letter = strExample.charAt(index - 1);
                if (letter != ' ') {
                    quantityWord++;
                }
                index++;
            }
        }
        return quantityWord + 1;
    }

    public static int secondRealization(String str) {
        Matcher matcher = PATTERNWORD.matcher(str);
        int quantityWord = 0;
        while (matcher.find()) {
            quantityWord++;
        }
        return quantityWord;
    }

    public static int thirdRealization(String str) {
        String[] stringArray = str.trim().split("[^\\w]+");
        return stringArray.length;
    }
}
