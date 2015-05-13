package lab20;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    public String findHex(String checkString) {
        Pattern pattern = Pattern.compile("0[Xx][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(checkString);
        String str = "Hex numbers: ";
        while (matcher.find()) {
            str += matcher.group() + ", ";
        }
        return str;
    }
}

