package pwt.regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kirilenko_MV on 11.05.2015.
 * Найти в строке все абзацы, в том числе у которых есть параметры и заменить найденное на простой тэг <p>
 */
public class Ex21 {
    public static void main(String[] args) {
        String str = "Text <p  id='12'> Text </p> Text <p>Text</p>Text";
        Pattern pattern = Pattern.compile("<p.*?>");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println("Начало обзаца: " + matcher.group());
        }

        System.out.println("Замена тэгов с параметрами: " + str.replaceAll("<p.*?>", "<p>"));
    }
}
