package task18;

//Имеется строка с текстом. Вывести текст,
// составленный из последних букв всех слов.
public class LastSymbolsOfWords {

    public String createWordOfLastChar(String string) {
        string = string.trim();
        int counterSplits = string.split(" +").length;
        String[] stringWords = new String[counterSplits];
        int counterWords = 0;
        for (int i = 0; i < stringWords.length; i++) {
            stringWords[counterWords] = string.split(" +")[i];
            counterWords++;
        }
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < counterWords; i++) {
            int lengthOfWord = stringWords[i].length();
            boolean foundPunctuation = stringWords[i].matches("[a-zA-Z0-9]+[.,?!]");
            if (foundPunctuation == true) {
                word = word.append(stringWords[i].charAt(lengthOfWord - 2));
            } else {
                word = word.append(stringWords[i].charAt(lengthOfWord - 1));
            }
        }
        return word.toString();
    }
}
