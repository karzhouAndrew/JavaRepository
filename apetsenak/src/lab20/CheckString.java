package lab20;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    private String checkString;

    CheckString(String str) {
        checkString = str;
    }

    public void findHex() {
        Pattern pattern = Pattern.compile("0[Xx][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(checkString);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
