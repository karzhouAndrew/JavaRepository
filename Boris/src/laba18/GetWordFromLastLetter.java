package laba18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Вывод слова составленый из последних букв слов данной строки
public class GetWordFromLastLetter {
    private final static Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+");

    public static String getWord(String str) {
        StringBuilder word = new StringBuilder("");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            word.append(str.charAt(matcher.end() - 1));
        }
        return word.toString();
    }
}
