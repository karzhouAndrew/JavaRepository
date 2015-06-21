package lab29;

import java.util.*;

/**
 * Created by Master on 27.05.2015.
 */
public class FrequencyDictionary {
    public Map<String, Integer> createFrequencyDictionary(String str) {
        str = str.replaceAll("\\,|\\.+", " ").toLowerCase();
        String array[] = str.replaceAll("  +", " ").split(" ");
        Map<String, Integer> frequenceDictionary = new HashMap<String, Integer>();
        for (String word : array) {
            int number = 0;
            for (String compareWord : array) {
                if (word.compareTo(compareWord) == 0) {
                    frequenceDictionary.put(word, ++number);
                }
            }
        }
        return frequenceDictionary;
    }

    public void sortFrequencyDictionary(Map<String, Integer> frequencyDictionary) {
        List dictionary = new ArrayList(frequencyDictionary.entrySet());
        Collections.sort(dictionary, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> firstWord, Map.Entry<String, Integer> secondWord) {
                return firstWord.getValue() - secondWord.getValue();
            }
        });
        System.out.println(dictionary);
    }


    public void printFrequencyDictionary(Map<String, Integer> frequencyDictionary) {
        for (Map.Entry<String, Integer> set : frequencyDictionary.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }

    }
}
