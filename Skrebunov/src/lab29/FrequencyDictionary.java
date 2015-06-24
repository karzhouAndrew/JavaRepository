package lab29;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PC on 24.06.2015.
 */
public class FrequencyDictionary {
    private final Pattern PATTERN = Pattern.compile("[а-яА-Я]+");

    public Map<String, Integer> createDictionary(String text) {
        Map<String, Integer> freqDictionary = new HashMap<String, Integer>();
        Matcher matcher = PATTERN.matcher(text);
        String word;
        while (matcher.find()) {
            word = matcher.group();
            if (freqDictionary.containsKey(word)) {
                freqDictionary.put(word, (freqDictionary.get(word) + 1));
            } else {
                freqDictionary.put(word, 1);
            }
        }
        return freqDictionary;
    }
}
