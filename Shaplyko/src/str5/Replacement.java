package str5;

public class Replacement {
    public StringBuilder replaceWord(String str) {
        StringBuilder newStr = new StringBuilder();
        String strSentences[] = str.toString().split("[.!?]");
        char[] arrayCharStr = str.toCharArray();
        char punctuationMark[] = new char[strSentences.length];
        int numberPunctuationMark = 0;
        for (int i = 0; i < arrayCharStr.length; ++i) {
            if (arrayCharStr[i] == '.' || arrayCharStr[i] == '!' || arrayCharStr[i] == '?') {
                punctuationMark[numberPunctuationMark] = arrayCharStr[i];
                numberPunctuationMark++;
            }
        }
        for (int i = 0; i < strSentences.length; ++i) {
            String[] strWord = strSentences[i].split(" ");
            String temp = strWord[0];
            strWord[0] = strWord[strWord.length - 1];
            strWord[strWord.length - 1] = temp;
            for (int j = 0; j < strWord.length; ++j) {
                if (j == strWord.length - 1) {
                    newStr.append(strWord[j]).append(punctuationMark[i]);
                } else {
                    newStr.append(strWord[j]).append(" ");
                }
            }
        }
        return newStr;
    }
}