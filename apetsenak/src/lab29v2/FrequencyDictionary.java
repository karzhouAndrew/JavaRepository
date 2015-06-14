package lab29v2;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyDictionary {
    public Map<String, Integer> createDict(String text) {
        String[] words = text.split("[\\p{Punct}\\s]+");
        Map<String, Integer> freqDict = new HashMap<String, Integer>();
        for (String word : words) {
            word = word.toLowerCase();
            if (freqDict.containsKey(word)) {
                freqDict.put(word, freqDict.get(word) + 1);
            } else {
                freqDict.put(word, 1);
            }
        }
        return freqDict;
    }

    public void printDict(String text) {
        Map<String, Integer> freqDict = createDict(text);
        Iterator<String> keySetIterator = freqDict.keySet().iterator();
        while (keySetIterator.hasNext()) {
            String word = keySetIterator.next();
            System.out.println("Word: " + word + ". \tNumber of repeats: " + freqDict.get(word));
        }
    }
}

