package laba18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Вывод слова составленый из последних букв слов данной строки
public class GetWordFromLastLetter {
    private String str;
    private final Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");

    public GetWordFromLastLetter(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getWord() {
        StringBuilder word = new StringBuilder("");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            word.append(str.charAt(matcher.end()-1));
        }

        return word.toString();
    }
}
