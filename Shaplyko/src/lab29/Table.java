package lab29;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private Map<String, Integer> words = new HashMap<String, Integer>();
    public static final String SPLIT_WORD = "[.!?,\\s]";

    public void creationTable(String str) {
        String strWord[] = str.split(SPLIT_WORD);
        for (int i = 0; i < strWord.length; ++i) {
            int counter = 1;
            for (int j = 0; j < strWord.length; ++j) {
                if (strWord[j].equalsIgnoreCase(strWord[i]) && i != j) {
                    counter++;
                }
            }
            words.put(strWord[i].toLowerCase(), counter);
        }
    }

    public void conclusionTable() {
        System.out.println("Частотная таблица :" + words);
    }
}
