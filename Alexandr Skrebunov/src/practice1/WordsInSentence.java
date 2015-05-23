package practice1;

/**
 * Created by PC on 17.05.2015.
 */
public class WordsInSentence {
    public String numberOfWords(String currentText) {
        int bufferForNumberOfWords = 0;
        int bufferForNumberOfWordsTwo = 0;
        String result = null;
        int maxRepeatWords = 0;
        String massOfSentences[] = currentText.split("[\\.?!]");
        for (int i = 0; i < massOfSentences.length; i++) {
            int numberOfSimilarWords = 0;
            String a = massOfSentences[i];
            String massOfWords[] = a.split(" +");
            for (int j = 0; j < massOfWords.length - 1; j++) {
                for (int k = j; k < massOfWords.length - 1; k++) {
                    if (massOfWords[j].equals(massOfWords[k + 1])) {
                        numberOfSimilarWords++;
                        String c = massOfWords[j];
                        if (c.equals(massOfWords[k + 1])) {
                            break;
                        }
                    }
                }
            }
            if (bufferForNumberOfWords < numberOfSimilarWords) {
                bufferForNumberOfWordsTwo = numberOfSimilarWords;
                bufferForNumberOfWords = bufferForNumberOfWordsTwo;
                result = massOfSentences[i];
                maxRepeatWords = bufferForNumberOfWordsTwo;
            }
        }
        return result;
    }
}
