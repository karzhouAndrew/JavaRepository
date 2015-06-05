package lab18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithText {
    public String createNewText(String oldText) {
        StringBuilder newText = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(oldText);
        while (matcher.find()) {
            newText.append(oldText.charAt(matcher.end() - 1));
        }
        return newText.toString();
    }
}
