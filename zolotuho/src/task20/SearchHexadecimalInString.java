package task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
// записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.
public class SearchHexadecimalInString {

    public int obtainEndPosition(StringBuilder stringBuilder, int startPosition) {
        Pattern pattern = Pattern.compile("[0][x][0-9a-fA-F]{1,}");
        Matcher matcher = pattern.matcher(stringBuilder);
        matcher.find(startPosition);
        return matcher.end();
    }

    public String obtainHexadecimalFromString(StringBuilder stringBuilder, int startPosition) {
        Pattern pattern = Pattern.compile("[0][x][0-9a-fA-F]{1,}");
        Matcher matcher = pattern.matcher(stringBuilder);
        if (matcher.find(startPosition)) {
            return matcher.group();
        } else {
            return null;
        }
    }
}
