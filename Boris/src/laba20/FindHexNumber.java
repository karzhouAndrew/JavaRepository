package laba20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Поиск шестнадцетеричного числа
public class FindHexNumber {
    private final static Pattern pattern = Pattern.compile("0x[0-9a-fA-F]+ ");

    public static String hexString(String str) {
        StringBuilder strHex = new StringBuilder();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            strHex.append(matcher.group());
            strHex.append(" ");
        }
        return strHex.toString();
    }

}
