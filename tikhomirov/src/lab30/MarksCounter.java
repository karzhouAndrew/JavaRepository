package lab30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarksCounter {
    public int marksCounter(String str) {
        int marksNumber = 0;
        Pattern pattern = Pattern.compile("[,.!?():;-]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            marksNumber++;
        }
        return marksNumber;
    }
}
