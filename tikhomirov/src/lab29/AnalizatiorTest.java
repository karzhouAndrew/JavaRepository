package lab29;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать частотный анализатор.
 */
public class AnalizatiorTest {
    static final String str = "раз два три четыре пять шесть раз два раз адын";

    public static void main(String[] args) {
        final TreeMap<String, Integer> words = new TreeMap<String, Integer>();
        List list = new ArrayList(words.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("list = " +words);

      /*  int n = 0;
        Pattern pattern = Pattern.compile("[а-яА-Я]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String str1 = str.substring(matcher.start(), matcher.end());
            str1 = (str1.toLowerCase()).trim();
            if (words.containsKey(str1)) {
                words.put(str1, ++n);
            } else {
                words.put(str1, 1);
            }
        }*/
    }
}


