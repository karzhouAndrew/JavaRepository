package practice1;

import java.util.regex.Pattern;

/**
 * Created by PC on 17.06.2015.
 */
public class WordsInSentence {
    private final Pattern PATTERN = Pattern.compile("[\\.?!]");

    public String calcWordsNumber(String currentText) {
        int bufferFirst = 0;
        int bufferSecond = 0;
        String result = null;
        int maxRepeatWords = 0;
        String massSentences[] = currentText.split(String.valueOf(PATTERN));
        for (int i = 0; i < massSentences.length; i++) {
            int similarWords = 0;
            String text = massSentences[i];
            String words[] = text.split(" +");
            for (int j = 0; j < words.length - 1; j++) {
                for (int k = j; k < words.length - 1; k++) {
                    if (words[j].equals(words[k + 1])) {
                        similarWords++;
                        String repeat = words[j];
                        if (repeat.equals(words[k + 1])) {
                            break;
                        }
                    }
                }
            }
            if (bufferFirst < similarWords) {
                bufferSecond = similarWords;
                bufferFirst = bufferSecond;
                result = massSentences[i];
                maxRepeatWords = bufferSecond;
            }
        }
        return result;
    }
}