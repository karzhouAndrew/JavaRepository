package task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
// записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.
public class SearchHexadecimalInString {

    public String obtainHexadecimalFromString(String string) {
        Pattern pattern = Pattern.compile("0x\\p{XDigit}+");
        Matcher matcher = pattern.matcher(string);
        StringBuilder stringBuilder = new StringBuilder();
        int position = 0;
        int increment = 0;
        while (matcher.find(position)) {
            stringBuilder.append(matcher.group());
            stringBuilder.append(' ');
            increment++;
            position = matcher.end();
        }
        return stringBuilder.toString();
    }
}
