package lab29;

import java.util.*;

/**
 * Created by Master on 27.05.2015.
 */
public class FrequencyDictionary {
    Map<String, Integer> createFrequencyDictionary(String str) {
        str = str.replaceAll("\\,|\\.+", " ").toLowerCase();
        String array[] = str.replaceAll("  +", " ").split(" ");
        Map<String, Integer> frequenceDictionary = new HashMap<String, Integer>();
        for (int i = 0; i < array.length; i++) {
            int number = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].compareTo(array[j]) == 0) {
                    number++;
                }
            }
            frequenceDictionary.put(array[i], number);
        }
        return frequenceDictionary;
    }

    public void sortFrequencyDictionary(Map<String, Integer> frequenceDictionary) {
        List dictionary = new ArrayList(frequenceDictionary.entrySet());
        Collections.sort(dictionary, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> firstWord, Map.Entry<String, Integer> secondWord) {
                return firstWord.getValue() - secondWord.getValue();
            }
        });
        System.out.println(dictionary);
    }


    void printFrequencyDictionary(Map<String, Integer> frequenceDictionary) {
        for (Map.Entry<String, Integer> set : frequenceDictionary.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }

    }
}
