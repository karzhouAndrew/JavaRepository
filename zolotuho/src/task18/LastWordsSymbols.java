package task18;

//Имеется строка с текстом. Вывести текст,
// составленный из последних букв всех слов.
public class LastWordsSymbols {

    public String createLastCharWord(String text) {
        text = text.trim();
        String[] stringWords = text.split(" +");
        int counterWords = stringWords.length;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < counterWords; i++) {
            int wordsLength = stringWords[i].length();
            boolean foundPunctuation = stringWords[i].matches("[a-zA-Z0-9]+[.,?!]");
            if (foundPunctuation == true) {
                word = word.append(stringWords[i].charAt(wordsLength - 2));
            } else {
                word = word.append(stringWords[i].charAt(wordsLength - 1));
            }
        }
        return word.toString();
    }
}
