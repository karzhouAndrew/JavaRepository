package lab20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    public void findNumber(String str) {
        Pattern pattern = Pattern.compile("-?0x\\w\\w?\\w?\\w?");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}