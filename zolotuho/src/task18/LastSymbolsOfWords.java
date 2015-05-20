package task18;

import java.util.Arrays;

//Имеется строка с текстом. Вывести текст,
// составленный из последних букв всех слов.
public class LastSymbolsOfWords {

    public StringBuilder createWordOfLastChar(String string) {
        string = string.trim();
        String stringSplat;
        stringSplat = Arrays.toString(string.split(" "));
        int counterSplits = 0;
        counterSplits = stringSplat.length() - string.length() - 1;
        String[] stringWords = new String[counterSplits];
        int counterWords = 0;
        for (int i = 0; i < stringWords.length; i++) {
            if (string.split(" ")[i].matches("") == false) {
                stringWords[counterWords] = string.split(" ")[i];
                counterWords++;
            }
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < counterWords; i++) {
            int lengthOfWord = stringWords[i].length();
            boolean foundPunctuation = stringWords[i].matches("[a-zA-Z0-9]+[.|,|?|!]");
            if (foundPunctuation == true) {
                word = word.append(stringWords[i].charAt(lengthOfWord - 2));
            } else {
                word = word.append(stringWords[i].charAt(lengthOfWord - 1));
            }
        }
        return word;
    }
}
