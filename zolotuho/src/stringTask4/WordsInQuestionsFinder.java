package stringTask4;

//Во всех вопросительных предложениях текста найти и напечатать слова заданной длины.
public class WordsInQuestionsFinder {
    public String[] splitToSentences(String string) {
        return string.split("[!.?]+");
    }

    public String[] splitToWords(String string) {
        return string.split("[ ,.:;?!]+");
    }

    public String obtainQuestionSentences(String string) {
        String[] partDividedByQuestionMark = string.split("[?]+[!]*[ ]*");
        StringBuilder stringBuilder = new StringBuilder();
        String str = partDividedByQuestionMark[partDividedByQuestionMark.length - 1].trim();
        int border = partDividedByQuestionMark.length;
        if (str.matches(".+[!.]")) {
            border = partDividedByQuestionMark.length - 1;
        }
        for (int i = 0; i < border; i++) {
            String[] tempString = splitToSentences(partDividedByQuestionMark[i]);
            stringBuilder.append(tempString[tempString.length - 1]);
            stringBuilder.append("? ");
        }
        return stringBuilder.toString();
    }

    public void showCertainLengthWords(String[] words, int length) {
        for (String word : words) {
            if (length == word.length()) {
                System.out.println(word);
            }
        }
    }
}
