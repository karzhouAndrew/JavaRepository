package Lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab21 {
    public void searchTag(String str) {
        Pattern p = Pattern.compile("<p.*?>");
        Matcher m = p.matcher(str);
        System.out.println("Начальный текст: " + str);
        str = m.replaceAll("<p>");
        System.out.println("Редактированный текст: " + str);

    }
}
