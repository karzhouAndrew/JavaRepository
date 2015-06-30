package task27;

import java.util.*;

//создать частотный словарь
public class FrequencyDictionary {
    private Map<String, Integer> dictionary;

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

    public void makeFrequencyDictionary(String string) {
        String[] words = string.split("[ .,?!-:;]+");
        String[] uniqueWords = new String[words.length];
        int[] frequency = new int[words.length];
        int indexUniqueWords = 0;
        for (int i = 0; i < words.length - 1; i++) {
            int equalWordCounter = 1;
            if (words[i] == null) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    equalWordCounter++;
                    words[j] = null;
                }
            }
            frequency[indexUniqueWords] = equalWordCounter;
            uniqueWords[indexUniqueWords] = words[i];
            indexUniqueWords++;
        }
        indexUniqueWords = 0;
        while (frequency[indexUniqueWords] != 0) {
            dictionary.put(uniqueWords[indexUniqueWords], frequency[indexUniqueWords]);
            indexUniqueWords++;
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
