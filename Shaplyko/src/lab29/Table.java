package lab29;
import java.util.HashMap;
import java.util.Map;


public class Table {
    Map<String, Integer> words = new HashMap<String, Integer>();

    public void creationTable(String str) {
        String strSentences[] = str.toString().split("[.!?,]");
        for (int i = 0; i < strSentences.length; ++i) {
            String[] strWord = strSentences[i].split(" ");
            for (int k = 0; k < strWord.length; ++k) {
                int counter = 1;
                for (int j = 0; j < strSentences.length; ++j) {
                    String[] strWord1 = strSentences[j].split(" ");
                    for (int n = 0; n < strWord1.length; ++n) {
                        if (strWord[k].equalsIgnoreCase(strWord1[n]) && i != j) {
                            counter++;
                        }
                    }
                }
                words.put(strWord[k].toLowerCase(), counter);
            }
        }
    }

    public void conclusionTable() {
        System.out.println("Частотная таблица :" + words);
    }
}

