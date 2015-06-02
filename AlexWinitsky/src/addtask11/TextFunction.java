package addtask11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Заменить в строке все вхождения 'child' на 'children'.  Удалить из текста все символы, являющиеся цифрами.
 */
public class TextFunction {
    public void deleteNumbers(String text) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(""));
    }

    public void findAndReplaceWord(String text) {
        Pattern pattern = Pattern.compile("child");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll("children"));
    }
}
