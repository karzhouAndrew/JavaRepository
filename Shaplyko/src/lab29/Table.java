package lab29;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<String, Integer> words = new HashMap<String, Integer>();
    public static final String SPLIT_WORD = "[.!?,\\s]";

    public void creationTable(String str) {
        String strWord[] = str.split(SPLIT_WORD);
        for (int i = 0; i < strWord.length; i++) {
            strWord[i] = strWord[i].toLowerCase();
            if (words.containsKey(strWord[i])) {
                words.put(strWord[i], words.get(strWord[i]) + 1);
            } else {
                words.put(strWord[i], 1);
            }
        }
    }

    public void conclusionTable() {
        System.out.println("Частотная таблица :" + words);
    }
}

