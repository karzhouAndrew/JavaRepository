package lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 21
 * Написать программу, выполняющую поиск в строке всех тегов абзацев,
 * в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class FindTegP {


    private final String REGULAR_EXPRESSION = "<p\\s.*?>";

    String findTeg(String str) {
        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION);
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("<p>");
    }

}
