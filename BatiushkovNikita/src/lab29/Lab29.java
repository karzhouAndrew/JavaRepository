package lab29;

// Имеется текст. Следует составить для него частотный словарь.

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab29 {

    private final static String REG_EXP = "[a-zA-Zа-яА-Я-]+";

    public static void main(String[] args) {
        String testText = "Как было сказано выше, если при добавлении элемента в качестве ключа был передан null, " +
                "действия будут отличаться. Будет вызван метод putForNullKey(value), внутри которого нет вызова " +
                "методов hash() и indexFor() (потому как все элементы с null-ключами всегда помещаются в table[0]), " +
                "но есть такие действия:";
        System.out.println(getFreqDictionary(testText));
    }

    public static Map<String, Integer> getFreqDictionary(String text) {
        Map<String, Integer> freqDictionary = new HashMap<String, Integer>();
        Pattern pattern = Pattern.compile(REG_EXP);
        Matcher matcher = pattern.matcher(text);
        String word;
        while (matcher.find()) {
            word = matcher.group();
            if (!freqDictionary.containsKey(word)) {
                freqDictionary.put(word, 1);
            } else {
                freqDictionary.put(word, (freqDictionary.get(word) + 1));
            }
        }
        return freqDictionary;
    }
}
