package lab16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dmitry on 12.5.15.
 */
public class StringNew {
    public static final Pattern pattern = Pattern.compile("\\p{Punct}");

    StringNew(String str) {
        int k = 0;
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            k++;
        }
        System.out.println(k);
    }
}


