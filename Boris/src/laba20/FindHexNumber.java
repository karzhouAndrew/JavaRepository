package laba20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Поиск шестнадцетеричного числа
public class FindHexNumber {
    private String str;
    private Pattern pattern = Pattern.compile("0x[0-9a-fA-F]+ ");

    public FindHexNumber(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void HexOut() {
        System.out.println(HexString());
    }

    private String HexString() {
        String strHex = new String();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            strHex += matcher.group();
            strHex+=" ";
        }
        return strHex;
    }

}
