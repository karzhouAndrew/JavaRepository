package task27;

import java.util.*;

//создать частотный словарь
public class FrequencyDictionary {
    private Map<String, Integer> dictionary;
    private static final String REGEX_TEXT_TO_WORDS_PATTERN = "[\\p{Punct}\\s]+";

    public FrequencyDictionary() {
        dictionary = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
    }

    public Map<String, Integer> getDictionary() {
        return dictionary;
    }

    public Set<Map.Entry<String, Integer>> getDictionaryEntrySet() {
        return dictionary.entrySet();
    }

    public void setDictionary(Map<String, Integer> dictionary) {
        this.dictionary = dictionary;
    }

    public void makeFrequencyDictionary(String text) {
        String[] words = text.split(REGEX_TEXT_TO_WORDS_PATTERN);
        for (String word : words) {
            word = word.toLowerCase();
            if (dictionary.containsKey(word)) {
                dictionary.put(word, dictionary.get(word) + 1);
            } else {
                dictionary.put(word, 1);
            }
        }
    }

    public void showFrequencyDictionary() {
        Iterator<Map.Entry<String, Integer>> iteratorCouples = dictionary.entrySet().iterator();
        System.out.println("Dictionary");
        while (iteratorCouples.hasNext()) {
            System.out.println(iteratorCouples.next());
        }
    }
}
