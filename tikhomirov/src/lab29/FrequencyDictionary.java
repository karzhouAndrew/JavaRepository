package lab29;

import java.util.HashMap;
import java.util.Map;

/**
 * Имеется текст. Составить для него частотный словарь.
 */
public class FrequencyDictionary {
    private static final String SENTENCE = "One two three FOUR five six seven eight two one one four five four three " +
            "four nine eight one one";

    public static void main(String[] args) {
        Map<String, Integer> freqDictionary = new HashMap<>();
        String[] words = SENTENCE.split("[,.!?-]? +");
        for (int i = 0; i < words.length; i++) {
            if (freqDictionary.containsKey(words[i].toLowerCase())) {
                freqDictionary.put(words[i], freqDictionary.get(words[i]) + 1);
            } else freqDictionary.put(words[i].toLowerCase(), 1);
        }
        System.out.println(freqDictionary);
    }
}
