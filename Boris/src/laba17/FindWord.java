package laba17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Подсчитать кол-во слов в тексте.
public class FindWord {
    private final Pattern patternW = Pattern.compile("\\w+");
    private String str;

    public FindWord(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int firstRealization() {
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

    public int secondRealization() {
        Matcher matcher = patternW.matcher(str);
        int quantityWord = 0;
        while (matcher.find()) {
            quantityWord++;
        }
        return quantityWord;
    }
}
