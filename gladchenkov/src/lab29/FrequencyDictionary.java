package lab29;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDictionary {

    public String deleteSpecialSymbols(String str) {
        return str.replaceAll("[,.!()-?:]*", "");
    }

    public Map<String, Integer> getDictionary(String str) {
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                Integer value = dictionary.get(word);
                dictionary.put(word, value + 1);
            } else
                dictionary.put(word, 1);
        }
        for (String key : dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }
        return dictionary;
    }

}
