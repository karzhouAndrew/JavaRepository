package lab20;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    public String findHex(String checkString) {
        Pattern pattern = Pattern.compile("0[Xx][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(checkString);
        StringBuilder str = new StringBuilder("Hex numbers: ");
        while (matcher.find()) {
            str.append(matcher.group());
            str.append(", ");
        }
        return str.toString();
    }
}

